package com.coin.dispenser.service;

import com.coin.dispenser.entity.CoinDispenserEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CoinDispenserService {

    public CoinDispenserEntity calculateChange(Double amount, List<Integer> coins) {

        String noOfCoins = countCoins(amount, coins);
        CoinDispenserEntity coinDispenserEntity = new CoinDispenserEntity();
        coinDispenserEntity.setAmount(amount);
        coinDispenserEntity.setChange(noOfCoins);
        return coinDispenserEntity;
    }

    public String countCoins(Double amount, List<Integer> coins) {
        List<String> returnString = new ArrayList<>();
        try {
            returnString.add("Coins needed: ");
            int x = 1;
            while (amount > 0) {
                if (amount - coins.get(x - 1) >= 0 && (x - 1) < coins.size()) {
                    amount = amount - coins.get(x - 1);
                    returnString.add("V" + x + " = " + coins.get(x - 1));
                    x++;
                } else {
                    x = 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        return returnString.toString();
    }
}
