package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

@RestController
public class RabatController {

    @GetMapping("/rabat")
    public BigDecimal obliczRabat(@RequestParam BigDecimal kwota) {

        if (kwota.compareTo(new BigDecimal("200")) > 0) {

            return kwota.multiply(new BigDecimal("0.90"));

        } else {

            return kwota;
        }
    }
}