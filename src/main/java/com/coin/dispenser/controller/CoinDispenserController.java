package com.coin.dispenser.controller;

import com.coin.dispenser.entity.CoinDispenserEntity;
import com.coin.dispenser.service.CoinDispenserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CoinDispenserController {

    @Autowired
    private CoinDispenserService coinDispenserService;

    @PostMapping("/coinDispenser/{amount}")
    public CoinDispenserEntity calculateChange(@PathVariable Double amount, @RequestBody List<Integer> coins) {
        return coinDispenserService.calculateChange(amount, coins);
    }

    @PostMapping("/test")
    public String testService() {
        return "Test ran";
    }
}
