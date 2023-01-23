package app;

import app.product.Menu;
import app.product.Product;
import app.product.ProductRepository;

import java.util.Scanner;

public class OrderApp {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);

        System.out.println("🥪 Brunch Cafe Order Service");
//        while (true) {
            // 메뉴 출력
            menu.printMenu();
            String input = scanner.nextLine();
            // (0) 누르면 장바구니 기능
            // (+) 누르면 주문하기 기능
        //}
    }
}
