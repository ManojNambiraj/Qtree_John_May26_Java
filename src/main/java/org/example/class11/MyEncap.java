package org.example.class11;

//  Encapsulation
//    1. Getter
//    2. Setter

class Car{
    private String color;
    private int model;
    private String manufacturer;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void setColor(String colorCode){
        this.color = colorCode;
    }

    String getColor(){
        return this.color;
    }
}

public class MyEncap {
    static void main(String[] args) {

        Car obj = new Car();

        obj.setColor("red");
        obj.setManufacturer("Honda");
        obj.setModel(2012);

        System.out.println(obj.getColor());
        System.out.println(obj.getManufacturer());
        System.out.println(obj.getModel());


    }
}
