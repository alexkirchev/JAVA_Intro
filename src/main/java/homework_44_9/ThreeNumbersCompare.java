package homework_44_9;

public class ThreeNumbersCompare {
    public static void main(String[] args) {
        compare(12, 1, -3);
        compareIf(2,-3, 4);
        areEqual(3,2,3);

    }
    public static void compare(int a, int b, int c) {

        System.out.println(a > 0 ? "a is positive" : "a is 0 or negative");
        System.out.println(b > 0 ? "b is positive" : "b is 0 or negative");
        System.out.println(c > 0 ? "c is positive" : "c is 0 or negative");
    }
    public static void compareIf (int a, int b, int c){
        if (a > 0){
            System.out.println("a is positive");
        }else if (a <= 0){
            System.out.println("a is 0 or negative");
        }
        if (b > 0){
            System.out.println("b is positive");
        }else if (b <= 0){
            System.out.println("b is 0 or negative");
        }
        if (c > 0){
            System.out.println("c is positive");
        }else{
            System.out.println("c is 0 or negative");
        }
    }
    public static void areEqual(int a, int b, int c){
        if (a == b){
            System.out.println("a, b are equal");
        }else {
            System.out.println("not equal");
        }
        if (b == c){
            System.out.println("b,c are equal");
        }else {
            System.out.println("not equal");
        }
        if (c == a){
            System.out.println("c, a are equal");
        }else {
            System.out.println("not equal");
        }
    }
}
