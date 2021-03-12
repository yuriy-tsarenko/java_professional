package com.java_professional.diledsys.homework.lesson1.product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList();
              productList.add(new Product("ведро",10));
              productList.add(new Product("грабли",12));
              productList.add(new Product("лапата",10));
              productList.add(new Product("вилы",13));
              productList.add(new Product("сапка",23));
              productList.add(new Product("шланг",290));
              productList.add(new Product("кран",10));
              productList.add(new Product("акрил",15));

        Collections.sort(productList);
        for (Product product:productList){
            System.out.println(product);
        }
    }
}
