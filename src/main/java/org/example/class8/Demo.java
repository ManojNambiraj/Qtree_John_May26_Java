package org.example.class8;

public class Demo {
    static void main(String[] args) {
        Car bmw = new Car();
        Car honda = new Car();

        bmw.no_of_wheels = 4;
        bmw.no_of_sheets = 7;
        bmw.model = "X3";
        bmw.color = "blue";
        bmw.fuel = "Petrol";

        System.out.println("BMW: " + bmw.model);
        System.out.println("BMW: " + bmw.color);
        System.out.println("BMW: " + bmw.fuel);
        System.out.println("BMW: " + bmw.no_of_sheets);
        System.out.println("BMW: " + bmw.no_of_wheels);
        bmw.carSpeed(380);

        honda.no_of_wheels = 5;
        honda.no_of_sheets = 6;
        honda.model = "Civic";
        honda.color = "red";
        honda.fuel = "Petrol";

        System.out.println("Honda: " + honda.model);
        System.out.println("Honda: " + honda.color);
        System.out.println("Honda: " + honda.fuel);
        System.out.println("Honda: " + honda.no_of_sheets);
        System.out.println("Honda: " + honda.no_of_wheels);
        honda.carSpeed(260);


    }
}
