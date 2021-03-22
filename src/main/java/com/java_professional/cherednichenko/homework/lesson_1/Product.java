package com.java_professional.cherednichenko.homework.lesson_1;

import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//Задание 2
//        Вывод на экран элементов List: Создать список,
//        заполнить его на 10 элементов и вывести на экран содержимое используя iterator.
//        Дополнительное задание:
//        Создать класс Product c 5-мя полями на выбор и реализовать
//        сортирование в разных направлениях учитывая все поля
public class Product {
    private String nameOfProduct;
    private String typeOfProduct;
    private String serialNumber;
    private int price;
    private int quantity;

    public static void main(String[] args) {
        Comparator<Product> comparator = new ProductNameComparator();
        TreeSet<Product> products = new TreeSet<Product>(comparator);
        products.add(new Product("nameOfProduct1", "Type1", "SN123456", 1000, 0));
        products.add(new Product("nameOfProduct2", "Type2", "SN123456", 1000, 1));
        products.add(new Product("nameOfProduct3", "Type3", "SN123456", 1000, 55));
        products.add(new Product("nameOfProduct7", "Type4", "SN123456", 1000, 2));
        products.add(new Product("nameOfProduct5", "Type5", "SN123456", 1000, 7));
        products.add(new Product("nameOfProduct6", "Type6", "SN123456", 1000, 9));
        products.add(new Product("nameOfProduct4", "Type7", "SN123456", 1000, 2));
        products.add(new Product("nameOfProduct8", "Type8", "SN123456", 1000, 3));
        products.add(new Product("nameOfProduct9", "Type9", "SN123456", 1000, 111));
        products.add(new Product("nameOfProduct10", "Type10", "SN123456", 1000, 22));
        products.add(new Product("CnameOfProduct9", "Type10", "SN123456", 1000, 22));
        products.add(new Product("BnameOfProduct10", "Type10", "SN123456", 1000, 22));
        products.add(new Product("AnameOfProduct10", "Type10", "SN123456", 1000, 22));
        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            System.out.println(productIterator.next());
        }
        System.out.println("<-------------------------------------------------->");
    }

    static class ProductNameComparator implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            int result;
            result = Integer.compare(o1.getQuantity(), o2.getQuantity());
            if (result == 0) {
                result = o1.getNameOfProduct().compareTo(o2.getNameOfProduct());
            }
            if (result == 0) {
                result = o1.getTypeOfProduct().compareTo(o2.getTypeOfProduct());
            }
            if (result == 0) {
                result = Integer.compare(o1.getPrice(), o2.getPrice());
            }
            return result;
        }
    }
}
