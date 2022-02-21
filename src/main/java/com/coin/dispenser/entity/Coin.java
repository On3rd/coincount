package com.coin.dispenser.entity;

public class Coin {

    private Integer V1;
    private Integer V2;
    private Integer V3;
    private Integer V4;

    public Coin() {
    }

    public Coin(Integer v1, Integer v2, Integer v3, Integer v4) {
        V1 = v1;
        V2 = v2;
        V3 = v3;
        V4 = v4;
    }

    public Integer getV1() {
        return V1;
    }

    public void setV1(Integer v1) {
        V1 = v1;
    }

    public Integer getV2() {
        return V2;
    }

    public void setV2(Integer v2) {
        V2 = v2;
    }

    public Integer getV3() {
        return V3;
    }

    public void setV3(Integer v3) {
        V3 = v3;
    }

    public Integer getV4() {
        return V4;
    }

    public void setV4(Integer v4) {
        V4 = v4;
    }
}
