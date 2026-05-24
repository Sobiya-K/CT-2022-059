import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        System.out.println("Enter date: ");
        int date = scanner.nextInt();

        GregorianCalendar myCalendar = new GregorianCalendar(year,month,date);
        myCalendar.setTime(myCalendar.getTime());




    }
}