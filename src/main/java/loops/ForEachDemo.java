package loops;

import java.util.Arrays;

public class ForEachDemo {
    public static void main(String[] args) {
        int [] numbers = {47, 8, 2, 48, 710, 99};
        String[] names = {"Alex", "Nena", "Gogo", "Boby"};

        Arrays.sort(numbers);
        for (int number: numbers) {
            System.out.printf("Number is: %d%n", number);
        }
        Arrays.sort(names);
        for (String name: names){
            System.out.printf("Name is: %s%n", name);
        }

    }
}
