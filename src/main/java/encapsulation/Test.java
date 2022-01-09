package encapsulation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person ("", -10);
        Person elena = new Person("Elena", 11.00);
        Person alex = new Person("Alex", 4.00);


        Product coffee = new Product("Coffee", 10.00);
        Product tea = new Product("Tea",2.00);
        Product juice = new Product("Juice", 2.00);
        Product bread = new Product("Bread", 1.00);


        elena.buy(coffee);
        alex.buy(tea);
        alex.buy(tea);
        elena.buy(tea);
        elena.printItemsInBag();
        alex.printItemsInBag();

        Person mimi = new Person("Mimi", 0.00);
        mimi.buy(juice);
        mimi.printItemsInBag();

        Person petar = new Person("Petar", -3.00);
        petar.buy(bread);
        petar.printItemsInBag();

        Scanner scanner = new Scanner(System.in);
        String people = scanner.nextLine();

    }

    private String [] parsePeopleNames (String input){
        if (input.contains(";")){
            String [] peoples = input.split(";");
            String [] names = new String[peoples.length];
            String [] values = new String[peoples.length];

            for (int i = 0; i < peoples.length; i++) {
                int index = peoples[i].indexOf("=");
                names [i] = peoples[i].substring(0, index);
            }
            return names;
        }else{
            int index = input.indexOf("=");
            String [] name = new String[1];
            name [0] = input.substring(0, index);
            return name;
        }
    }

    private String [] parsePeopleValues (String input){
        if (input.contains(";")){
            String [] peoples = input.split(";");
            String [] names = new String[peoples.length];
            String [] values = new String[peoples.length];

            for (int i = 0; i < peoples.length; i++) {
                int index = peoples[i].indexOf("=");
                values [i] = peoples[i].substring(index, peoples.length -1);
            }
            return names;
        }else{
            int index = input.indexOf("=");
            String [] value = new String[1];
            value [0] = input.substring(index, input.length()-1);
            return value;
        }
    }

}