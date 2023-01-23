package app.product;

import app.product.subproduct.Brunch;
import app.product.subproduct.Coffee;
import app.product.subproduct.Shake;
import app.product.subproduct.Tea;

public class ProductRepository {
    private final Product[] products = {
            new Brunch(1, "에그샌드위치", 2500, false, 3000),
            new Brunch(2, "베이컨에그샌드위치", 3500, false, 4500),
            new Brunch(3, "베이컨야채샌드위치", 3300, false, 4000),
            new Coffee(4, "아메리카노", 2000, false, 0),
            new Coffee(5, "카페라떼", 2500, false, 0),
            new Coffee(6, "아인슈페너", 5000, false, 0),
            new Tea(7, "루이보스티", 3000, false),
            new Tea(8, "페퍼민트티", 4100, false),
            new Shake(9, "바닐라 쉐이크", 5000, true, false),
            new Shake(10, "딸기 쉐이크", 5500, true, false),
            new Shake(11, "쿠앤크 쉐이크", 5900, false, true),
    };

    public Product[] getAllProducts() {
        return products;
    }
}
