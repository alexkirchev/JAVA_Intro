package homework_44_9;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a Password: ");
        String password = input.nextLine(); //
        if (isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValid(String password) {
        //връща true само ако паролата
        //1. съдържа 8 знака лили повече
        //2. съдържа букви цифри и специални знаци
        //3. трябва да съдържа 1 цифра
        //4. трябва да съдържа 1 спец. знак. Това не знам как да го направя.
        if (password.length() < 8) {
            return false;
        } else {
            char c;
            int count = 0;
            for (int i = 0; i < password.length(); i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;
                }
            }
            if (count != 1 ){
                return false;
            }
        }
        return true;
    }
}
