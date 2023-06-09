package com.driver;

public class Main {
    static class Product{
        public int product(int x, int y){
            return x*y;
        }

        //overloading
        public int product(int x, int y, int z){
            return x*y*z;
        }

        //overloading
        public double product(double x,double y){
            return x*y;
        }
    }
    public static void main(String[] args) {
        Product p = new Product();
        int result1 = p.product(10,10);
//        System.out.println(result1);
        int result2 = p.product(10,10,30);
//        System.out.println(result2);
        double result3 = p.product(10.5,10.2);
//        System.out.println(result3);
    }
}
