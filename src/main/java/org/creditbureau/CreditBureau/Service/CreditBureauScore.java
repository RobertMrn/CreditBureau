package org.creditbureau.CreditBureau.Service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CreditBureauScore {
    public BigDecimal calculateScore(BigDecimal amount){
        if(amount.compareTo(BigDecimal.valueOf(0)) ==0){
            return BigDecimal.valueOf(800);
        }
        else if(amount.compareTo(BigDecimal.valueOf(100000)) >=0){
            return BigDecimal.valueOf(1);
        }
        else if(amount.compareTo(BigDecimal.valueOf(50000))>=0){
            return BigDecimal.valueOf(350);
        }
        return BigDecimal.valueOf(700);
    }
}
