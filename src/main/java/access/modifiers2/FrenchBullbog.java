package access.modifiers2;

import access.modifiers.Dog;

public class FrenchBullbog extends Dog {
    public final String breed = "French bulldog";
    @Override
    public void publicDogMethod(){
        System.out.println("This is the new method");
    }
}
