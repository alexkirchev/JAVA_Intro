package homework_43_8;

public class Test {
    public static void main(String[] args) {
        Dog dogOne = new Dog();
        Breed dogOneBreed = new Breed();
        Duty dogOneDuty = new Duty();
        dogOneBreed.setBreedName("German shepherd, ");
        dogOneDuty.setDuty("shepherd dog, ");

        dogOne.setDuty(dogOneDuty);
        dogOne.setBreed(dogOneBreed);
        dogOne.setSex("male, ");
        dogOne.setAge(5);

        Dog dogTwo = new Dog();
        Breed dogTwoBreed = new Breed();
        Duty dogTwoDuty = new Duty();
        dogTwoBreed.setBreedName("Labrador, ");
        dogTwoDuty.setDuty("human guide, ");

        dogTwo.setDuty(dogTwoDuty);
        dogTwo.setBreed(dogTwoBreed);
        dogTwo.setSex("female, ");
        dogTwo.setAge(2);


        Breed catOneBreed = new Breed();
        Purpose catOnePurpose = new Purpose();
        Cat catOne = new Cat(catOneBreed, catOnePurpose);
        catOneBreed.setBreedName("Domestic cat, ");
        catOnePurpose.setCatPurpose("mouse hunting, ");

        catOne.setBreed(catOneBreed);
        catOne.setCatPurpose(catOnePurpose);
        catOne.setSex("female, ");
        catOne.setAge(8);


        Breed catTwoBreed = new Breed();
        Purpose catTwoPurpose = new Purpose();
        Cat catTwo = new Cat(catOneBreed, catOnePurpose);
        catTwoBreed.setBreedName("Persian cat, ");
        catTwoPurpose.setCatPurpose("cat show competition, ");


        catTwo.setBreed(catTwoBreed);
        catTwo.setCatPurpose(catTwoPurpose);
        catTwo.setSex("male, ");
        catTwo.setAge(9);

        System.out.println(dogOne.toString());
        System.out.println(dogTwo.toString());
        System.out.println(catOne);
        System.out.println(catTwo);


    }
}
