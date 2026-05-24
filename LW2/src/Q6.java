import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int year = input.nextInt();

        int age = 2026 - year;

        System.out.println("You were born in " + year +
                " and will be (are) " + age + " this year.");
    }
}
