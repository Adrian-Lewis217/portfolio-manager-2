package com.pluralsight.finance;

import java.math.BigDecimal;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public BigDecimal getValue() {
        BigDecimal baseValue = BigDecimal.ZERO;
        return baseValue.add(BigDecimal.valueOf(weight).multiply(new BigDecimal("1000000")));
    }
}
