package org.example.class10;

public class MyPoly {

    void multiplication(int a, int b){
        System.out.println("Int Result: " + (a * b));
    }

    void multiplication(double a, double b){
        System.out.println("Double Result: " + (a * b));
    }

    void multiplication(int a, int b, int c){
        System.out.println("Average Result: " + (a * b / c));
    }
    static void main(String[] args) {
        MyPoly obj = new MyPoly();

        obj.multiplication(5, 2);
        obj.multiplication(7.5, 2.2);
        obj.multiplication(3, 2, 2);

    }
}
