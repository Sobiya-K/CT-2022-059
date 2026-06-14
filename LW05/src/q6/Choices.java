package q6;

import java.util.ArrayList;
import java.util.Scanner;
import q4.*;

public class Choices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Pet> petList = new ArrayList<>();
        ArrayList<Cat> catList = new ArrayList<>();
        ArrayList<Dog> dogList = new ArrayList<>();

        System.out.println(" \n Pet Management System \n");

        while (true) {
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            String choice = input.nextLine();

            if (choice.equals("0")){
                System.out.println("Exiting ! ");
                break;
            }

            switch (choice) {
                case "1":
                    Cat cat = new Cat();
                    System.out.print("Enter the Cat name: ");
                    cat.setName(input.nextLine());
                    System.out.print("Coat Color: ");
                    cat.setCoatColor(input.nextLine());
                    cat.setType("cat");
                    catList.add(cat);
                    petList.add(cat);
                    System.out.println("Added successfully ! ");
                    break;

                case "2":
                    Dog dog = new Dog();
                    System.out.print("Enter the Dog name: ");
                    dog.setName(input.nextLine());
                    System.out.print("Dog's Weight: ");
                    dog.setWeight(input.nextDouble());
                    input.nextLine();
                    dog.setType("Dog");
                    dogList.add(dog);
                    petList.add(dog);
                    System.out.println("Added successfully ! ");
                    break;

                case "3":
                    System.out.print("Enter the Cat's Name to Remove: ");
                    String targetCatName = input.nextLine();
                    boolean cfound = false;

                    for (int i = 0; i < catList.size(); i++) {
                        if (catList.get(i).getName().equals(targetCatName)) {
                            catList.remove(i);
                            cfound = true;
                            break;
                        }
                    }
                    if (cfound) {
                        for (int i = 0; i < petList.size(); i++) {
                            if (petList.get(i).getName().equals(targetCatName)) {
                                petList.remove(i);
                                break;
                            }
                        }
                        System.out.println("\n" + targetCatName + " Removed successfully.\n");
                    } else {
                        System.out.println("There is no such cat");
                    }
                    break;

                case "4":
                    System.out.print("Enter the Dog's Name to Remove: ");
                    String targetDogName = input.nextLine();
                    boolean dfound = false;

                    for (int i = 0; i < dogList.size(); i++) {
                        if (dogList.get(i).getName().equals(targetDogName)) {
                            dogList.remove(i);
                            dfound = true;
                            break;
                        }
                    }
                    if (dfound) {
                        for (int i = 0; i < petList.size(); i++) {
                            if (petList.get(i).getName().equals(targetDogName)) {
                                petList.remove(i);
                                break;
                            }
                        }
                        System.out.println("\n" + targetDogName + " Removed successfully.\n");
                    } else {
                        System.out.println("There is no such dog");
                        break;
                    }
                default:
                    System.out.println("Invalid choice.");
            }
        }
        System.out.println("| Number of Pets | ");
        System.out.println("Total Number of Pets: " + petList.size() + "\n" + "Total Number of Dogs: " + dogList.size() + "\n" + "Total Number of Cats: " + catList.size());
        input.close();
    }
}

