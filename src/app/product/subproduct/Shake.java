package app.product.subproduct;

import app.product.Product;

public class Shake extends Product {
    // 옵션 : 아이스크림, 휘핑
    private boolean icecream;
    private boolean whipping;

    public Shake(int id, String name, int price, boolean icecream, boolean whipping) {
        super(id, name, price);
        this.icecream = icecream;
        this.whipping = whipping;
    }

    public boolean isIcecream() {
        return icecream;
    }

    public void setIcecream(boolean icecream) {
        this.icecream = icecream;
    }

    public boolean isWhipping() {
        return whipping;
    }

    public void setWhipping(boolean whipping) {
        this.whipping = whipping;
    }
}
