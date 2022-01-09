package staticexamples;

public class Test {
    private static int number;

    static {
        number = 13;
    }
    public static void main(String[] args) {
        System.out.println("Before create any car the number is: " + Car.getCounter());
        Car car1 = new Car("Red", "BMW");
        System.out.println("After creating first object nte number is: " + Car.getCounter());
        Car car2 = new Car("White", "Mercedes");
        System.out.println("After creating second object the number is: " + Car.getCounter());

        System.out.println("Car1 brand is " + car1.getBrand());
        System.out.println("Car1 color is " + car1.getColor());
        System.out.println("Car2 brand is " + car2.getBrand());
        System.out.println("Car2 color is " + car2.getColor());

        System.out.println("the static number from thr current (Test) class is: " + number);

        System.out.println("This plant is building " + Car.GAS_TYPE + " engines");


    }
}
