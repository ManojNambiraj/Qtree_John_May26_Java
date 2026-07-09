package org.example.Class16;

interface Dog{
    void BowBow();
}

interface Cat{
    void MeowMeow();
}

class Animal implements Dog, Cat{
   public void BowBow(){
       System.out.println("Bow Bow");
   }

   public void MeowMeow(){
       System.out.println("Meow Meow");
   }
}

public class MyInterface {
    static void main(String[] args) {
        Dog dog = new Animal();

        dog.BowBow();
    }
}
