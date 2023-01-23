package app.product.subproduct;

import app.product.Product;

public class Coffee extends Product {
    // 옵션 : 샷 추가 여부, 설탕시럽 몇 번
    private boolean addsout;
    private int suga;

    public Coffee(int id, String name, int price, boolean addsout, int suga) {
        super(id, name, price);
        this.addsout = addsout;
        this.suga = suga;
    }

    public boolean isAddsout() {
        return addsout;
    }

    public void setAddsout(boolean addsout) {
        this.addsout = addsout;
    }

    public int getSuga() {
        return suga;
    }

    public void setSuga(int suga) {
        this.suga = suga;
    }
}
