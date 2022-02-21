package com.coin.dispenser.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="CoinDispenserEntityTable")
public class CoinDispenserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long coinDispenserId;
    private Double amount;
    private String change;

    public CoinDispenserEntity() {
    }

    public CoinDispenserEntity(Long coinDispenserId, Double amount, String change) {
        this.coinDispenserId = coinDispenserId;
        this.amount = amount;
        this.change = change;
    }

    public Long getCoinDispenserId() {
        return coinDispenserId;
    }

    public void setCoinDispenserId(Long coinDispenserId) {
        this.coinDispenserId = coinDispenserId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }
}
