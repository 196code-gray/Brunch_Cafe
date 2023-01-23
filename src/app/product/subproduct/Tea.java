package app.product.subproduct;

import app.product.Product;

public class Tea extends Product {
    // 옵션 : 티백 제거 여부
    private boolean teabag;

    public Tea(int id, String name, int price, boolean teabag) {
        super(id, name, price);
        this.teabag = teabag;
    }

    public boolean isTeabag() {
        return teabag;
    }

    public void setTeabag(boolean teabag) {
        this.teabag = teabag;
    }
}
