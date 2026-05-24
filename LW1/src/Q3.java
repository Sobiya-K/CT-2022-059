import java.util.Scanner;

public class Q3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String FirstName = scanner.next();

        System.out.println("Enter your Middle Name: ");
        String MiddleName = scanner.next();


        System.out.println("Enter your Last Name: ");
        String LastName = scanner.next();

        System.out.println(FirstName + " " + MiddleName.substring(0,1)+ "." +" "+ LastName);
    }
}
