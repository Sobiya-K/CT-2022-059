package q2;

import q1.*;
import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pet[] petArray = new Pet[100];
        int petCounter = 0;

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
                typeSlctd = "cat";
            }else if (type.equals("d")) {
                typeSlctd = "dog";
            }else{
                typeSlctd = "Unknown Type";
            }

            petArray[petCounter] = new Pet(name, typeSlctd);
            petCounter++;

            System.out.println("Pet Added Successfully ! ");
        }

        System.out.println("\nYour Pet List :\n");
        System.out.println("|  No   |  NAME  |  TYPE  | ");
        for (int i = 0; i<petCounter; i++){
            System.out.println(" | "+(i+1)+"  |  "+petArray[i].getName()+"  |  "+petArray[i].getType()+"  |  ");
        }
    }
}
