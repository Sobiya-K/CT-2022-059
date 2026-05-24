import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String FirstName = scanner.next();

        System.out.println("Enter your Last Name: ");
        String LastName = scanner.next();

        String FullName = FirstName + " " + LastName;

        JFrame myWindow = new JFrame();
        myWindow.setSize(800,600);
        myWindow.setTitle(FullName);
        myWindow.setVisible(true);

    }
}
