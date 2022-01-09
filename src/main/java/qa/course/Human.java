package qa.course;

public class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >0)
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
        this.name = name;
    }
}
