package app.product.subproduct;

import app.product.Product;

public class Brunch extends Product {
    private boolean isBrunchSet;
    private int brunchSetPrice;

    public Brunch(int id, String name, int price, boolean isBrunchSet, int brunchSetPrice) {
        super(id, name, price);
        this.isBrunchSet = isBrunchSet;
        this.brunchSetPrice = brunchSetPrice;
    }

    public boolean isBrunchSet() {
        return isBrunchSet;
    }

    public void setBrunchSet(boolean brunchSet) {
        isBrunchSet = brunchSet;
    }

    public int getBrunchSetPrice() {
        return brunchSetPrice;
    }

    public void setBrunchSetPrice(int brunchSetPrice) {
        this.brunchSetPrice = brunchSetPrice;
    }
}
