package homework_43_8;

public class Cat extends Animal{
    private Breed breed = new Breed();
    private Purpose catPurpose = new Purpose();

    @Override
        public String toString(){
        return breed.getBreedName() + catPurpose.getCatPurpose() + getSex() + getAge();
    }

    public Cat(Breed breed, Purpose catPurpose){
        setBreed(breed);
        setCatPurpose(catPurpose);
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Purpose getCatPurpose() {
        return catPurpose;
    }

    public void setCatPurpose(Purpose catPurpose) {
        this.catPurpose = catPurpose;
    }
}
