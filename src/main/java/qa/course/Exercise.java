package qa.course;

public class Exercise {
    public static void main(String[] args) {
//        compare(20, 20);
//        printMonth(113);
        weekDays(9);
//        leapYearChecker(2100);
        rectangleLenght(2,9);
        rectangleArea(8,9);
        evenNumberChecker(9);
        findLargestOfThreeNumbers(2,8,80);
    }
    public static void compare(int a, int b){
        if (a == b){
            System.out.println("Are equal");
        }else if(a > b){
            System.out.println("a is bigger");
        }else{
            System.out.println("b is bigger");
        }
    }
    public static void printMonth(int month){
        String result = "Not valid month!";
        if (month == 1){
            result = "jan";
        }else if(month == 2){
            result = "feb";
        }else if (month == 3){
            result = "mar";
        }
        System.out.println(result);
    }
    public static void weekDays(int day){
        switch (day) {
            case 1:
                System.out.println("You have selected 1. Day of the week is Monday.");
                break;
            case 2:
                System.out.println("You have selected 2. Day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("You have selected 3. Day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("You have selected 4. Day of the week is Thursday.");
                break;
            case 5:
                System.out.println("You have selected 5. Day of the week is Friday.");
                break;
            case 6:
                System.out.println("You have selected 6. Day of the week is Saturday.");
                break;
            case 7:
                System.out.println("You have selected 7. Day of the week is Sunday.");
                break;
            default:
                System.out.println("not valid week day!");
                break;
        }
    }
    public static void leapYearChecker(int year){
          if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)){
              System.out.println("is leap year");
          }else {
              System.out.println("not a leap year");
          }
    }
    public static void rectangleLenght(int a, int b) {

        int rectangleLenght = 2 * a + 2 * b;
        System.out.println("the lenght of rectangle is " + rectangleLenght);
    }
    public static void rectangleArea(int a, int b){
        int rectangleArea = a * b;
        System.out.println("the rectangle area is " + rectangleArea);
    }
    public static void evenNumberChecker(int num) {
        if (num % 2 == 0){
            System.out.println((num) +" is an even number");
        }else {
            System.out.println((num) +" is an odd number");
        }
    }
    public static void findLargestOfThreeNumbers(int num1,int num2, int num3){
        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the largest number");
        }else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the largest number");
        }else{
            System.out.println(num3 + " is the largest umber");
        }
    }
}