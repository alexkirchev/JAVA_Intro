package access.modifiers;

public class Test {
    public static void main(String[] args) {
        Dog frenchie = new Dog();

        frenchie.breed = "french bulldog"; // possible because breed is public
        frenchie.name = "Ivan"; // possible because name is default accessible in the package
        frenchie.sex = "male"; // possible because sex is protected
        //frenchie.age = 10; // not accessible because is private, not accessible from another class

        frenchie.publicDogMethod(); //possible because breed is public
        frenchie.defaultDogMethod(); //possible because name is default, accessible in the package
        frenchie.protectedDogMethod(); //possible because sex is protected, accessible in the package
        //frenchie.privateDogMethod(); // not possible because age is private, accessible in same class only


    }
}
