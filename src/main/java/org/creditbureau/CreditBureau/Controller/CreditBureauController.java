package org.creditbureau.CreditBureau.Controller;

import org.creditbureau.CreditBureau.DTO.CreditBureauResponse;
import org.creditbureau.CreditBureau.Service.CreditBureauScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CreditBureauController {
    @Autowired
    CreditBureauScore creditBureauScore;

    @GetMapping("/getCreditBureauScore")
    public CreditBureauResponse getCreditBureauScore(@RequestParam BigDecimal amount){
        return new CreditBureauResponse(creditBureauScore.calculateScore(amount));
    }
}
