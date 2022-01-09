package homework_46_11_animals;

public class Mamal {
    protected String name;

    public Mamal(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void eat(String food){
        System.out.println(this.getName() + " eats " + food);
    }
}
