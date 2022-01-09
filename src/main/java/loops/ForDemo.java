package loops;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Index is: %d%n", i);
        }
        forLoop(3);
    }

    public static void forLoop(int i){
        for (int i1 = 0; i <= 10; i++) {
            System.out.printf("Index is: %d%n", i);
        }
    }
}

