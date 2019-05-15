package problem3;

import problem3.service.ExchangeService;
import problem3.service.ParameterService;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        String BASE_CURRENCY = "USD";
        String TARGET_CURRENCY = "BRL";
        BigDecimal valueToConvert = new BigDecimal(2);

        ParameterService parameterService = new ParameterService();

        ExchangeService exchangeService = new ExchangeService(parameterService);

        try {
            BigDecimal convertedValue = exchangeService.convert(BASE_CURRENCY, BASE_CURRENCY, valueToConvert);
            System.out.println("======================================================================================================");
            System.out.println("\n The value " + valueToConvert + " " + BASE_CURRENCY + " is equivalent to " + convertedValue + " " + TARGET_CURRENCY);
            System.out.println("\n======================================================================================================");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
