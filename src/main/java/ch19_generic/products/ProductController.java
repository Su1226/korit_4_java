package ch19_generic.products;

public class ProductController {
    public static void main(String[] args) {
        Product<String> product1 = new Product<String>("Laptop", "Intel i7, 16GB, 512GB SSD");
        Product<Double> product2 = new Product<Double>("SmartPhone", 799.99);
        Product<Boolean> product3 = new Product<Boolean>("Available", true);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
