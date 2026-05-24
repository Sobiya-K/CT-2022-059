import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Width: ");
        int W=scanner.nextInt();

        System.out.println("Enter the Height: ");
        int H=scanner.nextInt();

        System.out.println("Enter the title");
        String title=scanner.next();



        JFrame myWindow = new JFrame();
        myWindow.setSize(W,H);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }

}
