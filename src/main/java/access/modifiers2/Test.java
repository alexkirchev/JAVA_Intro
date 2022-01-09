package access.modifiers2;

import access.modifiers.Dog;
import encapsulation.Product;

public class Test {
    public static void main(String[] args) {
        Dog frenchie = new Dog();
        frenchie.breed = "french bulldog"; // possible because breed is public
        frenchie.publicDogMethod();


        FrenchBullbog frBullbog = new FrenchBullbog();
        //frBullbog.sex;//not possible because it is protected fpr its package
        //frBullbog.protectedDogMethod();//not possible because it is protected fpr its package
        frBullbog.publicDogMethod();

        //Product coffee = new Product("Coffee", 8.90);// can not be created, constructor Product is protected
        CoffeeProducts coffee = new CoffeeProducts("Coffee from class in this package", 1.20);


    }
}
