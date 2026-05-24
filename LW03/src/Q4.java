import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if(year%4==0) {
            //do another testing
            if (year % 100 == 0) {
                //do another testing
                if (year % 400 == 0) {
                    System.out.println("Its a leap year.");
                } else {
                    System.out.println("It is not a leap year.");
                }
            } else {
                System.out.println("It is not a leap year.");
            }
        }else{
            System.out.println("It is not a leap year.");
        }
    }
}