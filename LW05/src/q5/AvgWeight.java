package q5;

import java.util.Scanner;
import q4.*;

public class AvgWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pet[] petArray = new Pet[100];
        Dog[] dogArray = new Dog[100];

        int petCounter = 0;
        int dogCounter = 0;

        System.out.println("Enter 'STOP' when there are no pets to display\n");

        while (true) {
            System.out.print("Enter the pet name: ");
            String name = input.nextLine();

            if (name.equals("STOP")) {
                break;
            }

            System.out.print("Enter the pet type ('c' for cat, 'd' for dog): ");
            String type = input.nextLine();

            String typeSelected = "";

            if (type.equals("c")) {
                Cat cat = new Cat();
                typeSelected = "cat";
                System.out.print("Input Coat Color: ");
                String coat = input.nextLine();
                cat.setCoatColor(coat);
                cat.setName(name);
                cat.setType(typeSelected);
                petArray[petCounter] = cat;
            }else if (type.equals("d")) {
                Dog dog = new Dog();
                typeSelected = "dog";
                System.out.print("Input Weight: ");
                double wgt = Double.parseDouble(input.nextLine());
                dog.setWeight(wgt);
                dog.setName(name);
                dog.setType(typeSelected);
                petArray[petCounter] = dog;
                dogArray[dogCounter] = dog;
                dogCounter++;
            }else{
                typeSelected = "Unknown Type";
            }
            petCounter++;

            System.out.println("\nPet Added Successfully ! \n");
        }

        System.out.println("\n Average Weight of Dogs \n");
        double totalWeight = 0;
        int i;
        for (i = 0; i < dogCounter; i++) {
            totalWeight += dogArray[i].getWeight();
        }
        System.out.printf("Average Weight: %.2f", totalWeight/dogCounter);

        input.close();
    }
}
