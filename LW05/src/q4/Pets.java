package q4;

import java.util.Scanner;
import java.util.ArrayList;

public class Pets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<>();
        System.out.println("Enter 'STOP' when there are no pets to display\n");

        while (true) {
            System.out.print("Enter the pet name: ");
            String name = input.nextLine();

            if (name.equals("STOP")) {
                break;
            }

            System.out.print("Enter the pet type ('c' for cat, 'd' for dog): ");
            String type = input.nextLine();

            String typeSlctd = "";

            if (type.equals("c")) {
                Cat cat = new Cat();
                typeSlctd = "cat";
                System.out.print("Enter the Cat Color: ");
                String color = input.nextLine();
                cat.setCoatColor(color);
                cat.setName(name);
                cat.setType(typeSlctd);
                petList.add(cat);
            }else if (type.equals("d")) {
                Dog dog = new Dog();
                typeSlctd = "dog";
                System.out.print("Enter the Dog Weight: ");
                double weight = input.nextDouble();
                dog.setWeight(weight);
                dog.setName(name);
                dog.setType(typeSlctd);
                petList.add(dog);
                input.nextLine();
            }else{
                typeSlctd = "Unknown";
            }

            System.out.println("\nPet Added Successfully ! \n");
        }

        System.out.println("\nYour Pet List\n");
        System.out.println("  |  No   |   NAME  |  TYPE   |   Color/Weight  |  ");
        int i = 0;
        for (Pet pet : petList) {
            if (pet instanceof Cat) {
                Cat cat = (Cat) pet;
                System.out.println("  |  " + (i + 1) + "  |  " + cat.getName() + "  |  " + cat.getType() + "  |  " + cat.getCoatColor() + "  |  ");
            } else if (pet instanceof Dog) {
                Dog dog = (Dog) pet;
                System.out.println("  |  " + (i + 1) + "  |  " + dog.getName() + "  |  " + dog.getType() + "   |   " + dog.getWeight() + "  |  ");
            }
            i++;
        }
        input.close();
    }
}
