import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int[] orderIDs = new int [1000];
        int[] orderCounts = new int [1000];
        int idIndex = 0;
        int countIndex = 0;

        do{
            boolean order = true;

            System.out.println("Select a menu category: ");
            System.out.println("1.Entree");
            System.out.println("2.Side dish");
            System.out.println("3.Drink");
            System.out.println("4.Exit");

            int selection = scanner.nextInt();

            switch (selection){
                case 1:
                    System.out.println("Entree");
                    System.out.println();
                    System.out.println("1.Tofu Burger     $3.49");
                    System.out.println("2.Cajun Chicken   $4.59");
                    System.out.println("3.Buffalo Wings   $3.99");
                    System.out.println("4.Rainbow Fillet  $2.99");
                    break;
                case 2:
                    System.out.println("Side dish");
                    System.out.println();
                    System.out.println("5.Rice Cracker    $0.79");
                    System.out.println("6.No-Salt Fries   $0.69");
                    System.out.println("7.Zucchini        $1.09");
                    System.out.println("8.Brown Rice      $0.59");
                    break;
                case 3:
                    System.out.println("Drink");
                    System.out.println();
                    System.out.println("9.Cafe Mocha       $1.99");
                    System.out.println("10.Cafe Latte      $1.90");
                    System.out.println("11.Espresso        $2.49");
                    System.out.println("12.Oolong Tea      $0.99");
                    break;
                case 4:
                    run = false;
                    order = false;
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }

            while (order){
                System.out.println("Select an option:");
                System.out.println("1.Order a new item");
                System.out.println("2.Exit");
                int temp = scanner.nextInt();

                switch (temp){
                    case 1:
                        System.out.println("Enter the id of food item: ");
                        orderIDs[idIndex] = scanner.nextInt();
                        idIndex++;
                        System.out.println("Enter the count of food item: ");
                        orderCounts[countIndex] = scanner.nextInt();
                        countIndex++;
                        break;
                    case 2:
                        order = false;
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }

        } while (run);

        //print full order details using for loop
    }
}
