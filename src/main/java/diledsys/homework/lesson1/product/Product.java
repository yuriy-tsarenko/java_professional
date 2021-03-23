package diledsys.homework.lesson1.product;

public class Product implements Comparable<Product> {
    String name;
    Integer price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        if (this.name.compareTo(o.name) >= 1) {
            return 1;
        } else if (this.name.compareTo(o.name) <= -1) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\n Product{"
                +"name: " + name
                +" price: " + price
                +'}';
    }
}
