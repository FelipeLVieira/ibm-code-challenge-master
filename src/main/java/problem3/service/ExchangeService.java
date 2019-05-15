package problem3.service;

import okhttp3.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeService {

    ParameterService parameterService;

    @Autowired
    public ExchangeService(ParameterService parameterService){
        this.parameterService = parameterService;
    }

    public BigDecimal convert(String baseCurrency, String targetCurrency, BigDecimal value) throws Exception {

        String url = parameterService.findExchangeRateBaseApiUrl() + baseCurrency;

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response
                = restTemplate.getForEntity(url, String.class);

        final JSONObject obj = new JSONObject(response.getBody());
        final BigDecimal targetCurrencyMultiplier = new BigDecimal((Double) obj.getJSONObject("rates").get(targetCurrency));

        return targetCurrencyMultiplier.multiply(value).setScale(2, RoundingMode.HALF_EVEN);
    }
}
