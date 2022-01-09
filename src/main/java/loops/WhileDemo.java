package loops;

public class WhileDemo  {
    public static void main(String[] args) {

        whileDemo(5);
        factorial(4);

    }
    public static void whileDemo(int number){
        while (number <= 10){
            System.out.printf("Number is: %d%n", number);
            number++;
        }
    }
    public static void factorial(int n){
        int factorial = 1;
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
    }
}
