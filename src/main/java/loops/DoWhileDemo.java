package loops;

public class DoWhileDemo {
    public static void main(String[] args) {

        doWhile(1);
    }
    public static void doWhile(int number){
        do {
            System.out.printf("Number is: %d%n", number);
            number++;
        }while(number <= 3);

    }
}
