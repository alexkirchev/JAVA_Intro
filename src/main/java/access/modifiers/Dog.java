package access.modifiers;

public class Dog {
    public String breed; //променлва достъпна отвсякъде
    String name; // default променлва достъпна само в пакета
    protected String sex; // променлва достъпна в пакета и в клас наследник в друг пакет
    private int age; // променлва достъпна вътрешно само в класа

    public void publicDogMethod(){
        System.out.println("Method is accessible from anywhere");
    }

    void defaultDogMethod(){
        System.out.println("Method accessible within the current package");
    }

    protected void protectedDogMethod(){
        System.out.println("Method accessible from child class in different package");
    }

    private void privateDogMethod(){
        System.out.println("Method is internal for the class");
    }

}
