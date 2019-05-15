package problem3;

import problem3.service.ExchangeService;
import problem3.service.ParameterService;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        ParameterService parameterService = new ParameterService();

        ExchangeService exchangeService = new ExchangeService(parameterService);

        try {
            BigDecimal convertedValue = exchangeService.convert("USD", "BRL", new BigDecimal(1));
            System.out.println(convertedValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
