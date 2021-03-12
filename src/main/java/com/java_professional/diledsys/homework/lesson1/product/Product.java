package com.java_professional.diledsys.homework.lesson1.product;

public class Product implements Comparable<Product> {
    String name;
    Integer price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int compareTo(Product o) {
        int c=0;
        c=(this.name.compareTo(o.name)>1)?1:-1;
       if (c==0){
            c=(this.price.compareTo(o.price)<1)?1:-1;
       }
        return c;
    }

    @Override
    public String toString() {
        return "\n Product{" +
                "name: " + name  +
                " price: " + price +
                '}';
    }
}
