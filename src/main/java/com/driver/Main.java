package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        int result1 = p.product(10,10);
        System.out.println(result1);
        int result2 = p.product(10,10,30);
        System.out.println(result2);
        double result3 = p.product(10.5,10.2);
        System.out.println(result3);
    }
}
