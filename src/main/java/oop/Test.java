package oop;

public class Test {
    public static void main(String[] args) {
        Dog frenchie = new Dog();
        Breed frenchBulldog = new Breed();
        Address frenchiеAdress = new Address();
        frenchiеAdress.setCity("Sofia ");
        frenchiеAdress.setStreet("I.Vazov Street ");
        frenchiеAdress.setNumber( 1 );
        frenchBulldog.setBreedName("French bulldog ");

        frenchie.eat("bones");
        frenchie.setBreed(frenchBulldog);
        frenchie.setSex("male ");
        frenchie.setLocation(frenchiеAdress);

        System.out.println(frenchie.toString());
    }
}
 