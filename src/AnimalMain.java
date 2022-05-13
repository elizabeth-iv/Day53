import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Animal> list = new ArrayList<>();
        System.out.println("Animal Menu" + "\n" + "Entering nothing will stop the loop");

        while (true) {
            System.out.println("Please enter a name: ");
            String animalName = input.nextLine();
            if (animalName.equals("")) {
                break;
            }
            System.out.println("Is it a dog? Yes or No: ");
            String isDog = input.nextLine();
            boolean isItADog;
            if (isDog.equalsIgnoreCase("")) {
                break;
            }
            isItADog = isDog.equalsIgnoreCase("Yes");
            list.add(new Animal(animalName, isItADog));
        }
        for (Animal animal : list) {
            System.out.println(animal.toString());
        }
    }
}
