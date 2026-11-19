package pluralsight.finance;

import java.math.BigDecimal;

public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(String name, double karat) {
        super(name);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    @Override
    public BigDecimal getValue() {
        return null;
    }
}
