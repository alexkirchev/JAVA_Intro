package homework_43_8;

public class Dog extends Animal{
    private Breed breed = new Breed();
    private Duty duty = new Duty();

    @Override
    public String toString(){
        return breed.getBreedName() + duty.getDuty() + getSex() + getAge();
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Duty getDuty() {
        return duty;
    }

    public void setDuty(Duty duty) {
        this.duty = duty;
    }
}
