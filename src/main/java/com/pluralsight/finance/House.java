package com.pluralsight.finance;

import java.math.BigDecimal;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFeet;
    private int bedroom;

    public House(String name, int yearBuilt, int squareFeet, int bedroom) {
        super(name);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedroom = bedroom;
    }

    @Override
    public BigDecimal getValue() {
        return null;
    }
}
