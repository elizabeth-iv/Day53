public class Animal {
    private String animalName;
    private boolean isItADog;

    public Animal (){

    }

    public Animal (String animalName) {
        this.animalName = animalName;
        this.isItADog = true;
    }
    public Animal (boolean isItADog){
        this.isItADog = isItADog;
    }
    public Animal (String animalName, boolean isItADog) {
        this.animalName = animalName;
        this.isItADog = isItADog;
    }

    public String getAnimalName() {
        return animalName;
    }

    public Boolean getisItADog() {
        return isItADog;
    }
    public String toString() {
        return getAnimalName() + " is a dog: " + getisItADog();
    }

}