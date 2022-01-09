package linked.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String > cars = new LinkedList<String>();
        cars.add("Nissan");
        cars.add("Mazda");
        cars.add("Toyota");
        cars.add(0,"Honda");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.remove("Mazda");
        System.out.println(cars);
        System.out.println(cars.size());

    }
}
