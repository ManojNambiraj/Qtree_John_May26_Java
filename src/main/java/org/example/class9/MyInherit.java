package org.example.class9;

class GrandParent{
    boolean isAssets = true;

    void hairColor(String color){
        System.out.println("Hair color is: " +  color);
    }
}

class Parent extends GrandParent{
    int bankBalance = 100000;

    void Habits(){
        System.out.println("Parents Always having a Smiling face");
    }
}

class Child extends GrandParent{
    int packetMoney = 500;

    void Habits(){
        System.out.println("Chile is Always Playing");
    }
}

public class MyInherit {
    static void main(String[] args) {
        Child sam = new Child();

        System.out.println(sam.packetMoney);
        sam.hairColor("Black");
        sam.Habits();
    }
}
