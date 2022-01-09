package oop;

public class Dog extends Anilmal{
    private Breed breed = new Breed();
    public Address location = new Address();

    @Override
    public String toString(){
        return breed.getBreedName() + location.getCity() + location.getStreet() + location.getNumber();

    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null))
        this.breed = breed;
    }
}
