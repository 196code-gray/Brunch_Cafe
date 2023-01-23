package app.product;

import app.product.subproduct.Brunch;
import app.product.subproduct.Coffee;
import app.product.subproduct.Shake;
import app.product.subproduct.Tea;

public class Menu {
    private Product[] products;

    public Menu(Product[] products) {
        this.products = products;
    }

    public void printMenu() {
        System.out.println("[🔻] 메뉴");
        System.out.println("=".repeat(30));

        printBrunch();

        printCoffee();

        printTea();

        printShake();

        System.out.println();
        System.out.println("🧺 장바구니");
        System.out.println("📦 주문하기");
        System.out.println("=".repeat(30));
        System.out.println("[▫️] 메뉴를 선택해주세요");
    }

    private void printShake() {
        System.out.println("🥤 쉐이크");
        for (Product product : products) {
            if (product instanceof Shake) {
                printEach(product);
            }
        }
        System.out.println();
    }

    private void printTea() {
        System.out.println("🍵 차");
        for (Product product : products) {
            if (product instanceof Tea) {
                printEach(product);
            };
        }
        System.out.println();
    }

    private void printCoffee() {
        System.out.println("☕ 커피");
        for (Product product : products) {
            if (product instanceof Coffee) {
                printEach(product);
            }
        }
        System.out.println();
    }

    private void printBrunch() {
        System.out.println("🥪 브런치");
        for(Product product : products) {
            if (product instanceof Brunch) {
                printEach(product);
            }
        }
        System.out.println();
    }

    private static void printEach(Product product) {
        System.out.printf("(%d) %s %d\n",
                product.getId(), product.getName(), product.getPrice());
    }
}
