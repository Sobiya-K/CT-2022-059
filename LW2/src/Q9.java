import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double P = input.nextDouble();

        System.out.print("Enter Rate: ");
        double R = input.nextDouble();

        System.out.print("Enter Years: ");
        int N = input.nextInt();

        double total = P * Math.pow((1 + R/100), N);
        double earned = total - P;

        System.out.println("Money earned = " + earned);
    }
}
