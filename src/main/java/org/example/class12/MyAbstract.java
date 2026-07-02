package org.example.class12;

abstract class Car{
    abstract void speedOfCar();
    abstract void drive();

    void model(){
        System.out.println("This is a Car");
    }
}

class Honda extends Car{
    void speedOfCar(){
        System.out.println("Honda speed is:" + 280);
    }

    void drive(){
        System.out.println("Honda drive is:" + "Automatic");
    }
}

public class MyAbstract {
    static void main(String[] args) {
        Honda h1 = new Honda();
        h1.speedOfCar();
        h1.drive();
        h1.model();
    }
}
