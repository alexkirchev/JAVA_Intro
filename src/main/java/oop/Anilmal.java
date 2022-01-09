package oop;

public class Anilmal {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (!sex.isEmpty())
            this.sex = sex;
    }

    public void eat(String food) {
        System.out.println("Preffered food: " + food);
    }
}
