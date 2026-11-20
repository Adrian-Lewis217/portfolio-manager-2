package com.pluralsight.finance;

import java.math.BigDecimal;
import java.util.List;

public class Portfolio implements Valuable{
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public void add(Valuable asset){}

    // return the netValue of all assets
    public BigDecimal getValue(){
        BigDecimal netValue = BigDecimal.ZERO;

        for (Valuable asset : assets) {
            netValue = netValue.add(asset.getValue());
        }

        return netValue;
    }

    // return the asset with the highest value
    public Valuable getMostValuable(){

        Valuable mostValuable = assets.get(0);

        for (Valuable asset : assets) {
            if (asset.getValue().compareTo(mostValuable.getValue()) > 0){
                mostValuable = asset;
            }
        }
        return mostValuable;
    }

    // return the asset with the lowest value
    public Valuable getLeastValuable(){
        Valuable leastValuable = assets.get(0);

        for (Valuable asset : assets) {
            if (asset.getValue().compareTo(leastValuable.getValue()) < 0){
                leastValuable = asset;
            }
        }
        return leastValuable;
    }
}
