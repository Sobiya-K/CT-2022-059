package q3;

import java.util.ArrayList;
import java.util.Scanner;
import q1.*;

public class CatsFirst {
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
                typeSlctd = "cat";
            }else if (type.equals("d")) {
                typeSlctd = "dog";
            }else{
                typeSlctd = "Unknown Type";
            }

            Pet newPet = new Pet(name, typeSlctd);
            petList.add(newPet);

            System.out.println("Pet Added Successfully ! ");
        }

        System.out.println("\nYour Pet List :\n");
        System.out.println("|  No   |  NAME  |");

        for (int i = 0; i<petList.size(); i++){
            if(petList.get(i).getType().equals("cat")){
                Pet crntPet = petList.get(i);
                System.out.println("  |  "+(i+1)+"  |  "+crntPet.getName()+"  |  ");
            }
        }
        for (int i = 0; i<petList.size(); i++){
            if(petList.get(i).getType().equals("dog")){
                Pet crntPet = petList.get(i);
                System.out.println("  |  "+(i+1)+"  |   "+crntPet.getName()+"  |   ");
            }
        }
    }
}
