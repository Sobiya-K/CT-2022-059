import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String middle = sc.next();
        String last = sc.next();

        char middleInitial = middle.charAt(0);

        System.out.println(last + "," + first + " " + middleInitial + ".");
    }
}
