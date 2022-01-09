package homework_46_11_human;

public class Test {
    public static void main(String[] args) {
        Person joe = new Person();
        Person sam = new Person();
        joe.name = "Joe";
        sam.name = "Sam";

        joe.eat("Bread");
        sam.eat("Sandwiches");

        System.out.println(joe.toString());
    }
}
