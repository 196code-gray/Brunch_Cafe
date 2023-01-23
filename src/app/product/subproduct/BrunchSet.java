package app.product.subproduct;

import app.product.Product;
import app.product.subproduct.Brunch;

public class BrunchSet extends Product {
    private Brunch brunch;
    private Coffee coffee;
    private Tea tea;
    private Shake shake;

    public BrunchSet(int id, String name, int price, Brunch brunch, Coffee coffee, Tea tea, Shake shake) {
        super(id, name, price);
        this.brunch = brunch;
        this.coffee = coffee;
        this.tea = tea;
        this.shake = shake;
    }

    public Brunch getBrunch() {
        return brunch;
    }

    public void setBrunch(Brunch brunch) {
        this.brunch = brunch;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Tea getTea() {
        return tea;
    }

    public void setTea(Tea tea) {
        this.tea = tea;
    }

    public Shake getShake() {
        return shake;
    }

    public void setShake(Shake shake) {
        this.shake = shake;
    }
}
