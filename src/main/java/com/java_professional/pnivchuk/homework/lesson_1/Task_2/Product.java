package com.java_professional.pnivchuk.homework.lesson_1.Task_2;

/*Создать класс Product c 5-мя полями на выбор и реализовать сортирование в разных направлениях учитывая все поля*/
public class Product implements Comparable<Product> {
    private String shop;
    private String name;
    private int price;
    private int count;
    private boolean isNew;


    Product(String shop, String name, int price, int count, boolean isNew) {
        this.price = price;
        this.count = count;
        this.shop = shop;
        this.name = name;
        this.isNew = isNew;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }


    public boolean isNew() {
        return isNew;
    }

    public String getShop() {
        return shop;
    }

    /*@Override
    public int compareTo(Product other) {
        int difPrice = this.price - other.getPrice();
        int difCount = this.count - other.getCount();
        if (this.shop.compareTo(other.getShop()) > 0) {
            return 1;
        } else if (this.shop.compareTo(other.getShop()) < 0) {
            return -1;
        } else {
            if (this.name.compareTo(other.getName()) > 0) {
                return 1;
            } else if (this.name.compareTo(other.getName()) < 0) {
                return -1;
            } else {
                if (difPrice > 0) {
                    return 1;
                } else if (difPrice < 0) {
                    return -1;
                } else {
                    if (difCount > 0) {
                        return 1;
                    } else if (difCount < 0) {
                        return -1;
                    } else {
                        if (this.isNew) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                }
            }
        }

    }*/

    @Override
    public int compareTo(Product other) {
        int difPrice = this.price - other.getPrice();
        int difCount = this.count - other.getCount();
        if (this.shop.compareTo(other.getShop()) > 0) {
            return -1;
        } else if (this.shop.compareTo(other.getShop()) < 0) {
            return 1;
        } else {
            if (this.name.compareTo(other.getName()) > 0) {
                return -1;
            } else if (this.name.compareTo(other.getName()) < 0) {
                return 1;
            } else {
                if (difPrice > 0) {
                    return -1;
                } else if (difPrice < 0) {
                    return 1;
                } else {
                    if (difCount > 0) {
                        return -1;
                    } else if (difCount < 0) {
                        return 1;
                    } else {
                        if (this.isNew) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                }
            }
        }

    }

    @Override
    public String toString() {
        return "Shop - " + shop + "\n Name - " + name + "\n Price - " + price + "\n Count - " + count + "\n Is new - " + isNew + "\n-------------------------------------------";
    }
}
