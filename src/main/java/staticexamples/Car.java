package staticexamples;

public class Car {
    private String color;
    private final String brand;
    private static int counter;
    public final static String GAS_TYPE;

    static{
        GAS_TYPE = "Gasoline";
    }

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
        counter++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public static int getCounter() {
        return counter;
    }
}
