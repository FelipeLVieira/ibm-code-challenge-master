package problem3.service;

import okhttp3.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

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
        HttpUrl.Builder urlBuilder
                = HttpUrl.parse(parameterService.findExchangeRateBaseApiUrl()).newBuilder();
        urlBuilder.addQueryParameter("base", baseCurrency);

        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = new OkHttpClient().newCall(request);

        Response response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String responseBody = response.body().string();

        final JSONObject obj = new JSONObject(responseBody);
        final BigDecimal targetCurrencyMultiplier = new BigDecimal((Double) obj.getJSONObject("rates").get(targetCurrency));

        return targetCurrencyMultiplier.multiply(value).setScale(2, RoundingMode.HALF_EVEN);
    }
}
