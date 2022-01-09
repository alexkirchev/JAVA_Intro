package array.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add(0,"Tokyo");
        cities.add(1, "Rome");
        System.out.println(cities);
        System.out.println(cities.size());
        cities.remove(2);
        System.out.println(cities);
        System.out.println(cities.size());
    }
}
