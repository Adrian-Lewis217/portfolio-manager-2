package com.pluralsight.finance;

import java.util.List;

public class Portfolio {
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
    public void get(double netValue){
        
    }

    // return the asset with the highest value
    public Valuable getMostValuable(){

        return null;
    }

    // return the asset with the lowest value
    public Valuable getLeastValuable(){

        return null;
    }
}
