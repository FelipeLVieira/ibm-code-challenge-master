package problem3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import problem3.service.ExchangeService;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "exchange")
public class ExchangeController {

    ExchangeService exchangeService;

    @Autowired
    ExchangeController(ExchangeService exchangeService){
        this.exchangeService = exchangeService;
    }

    @GetMapping("/convert")
    @ResponseStatus(HttpStatus.OK)
    BigDecimal convert(@RequestParam String baseCurrency, @RequestParam String targetCurrency, @RequestParam BigDecimal value) throws Exception {
        return exchangeService.convert(baseCurrency, targetCurrency, value);
    }
}
