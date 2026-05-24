import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int middle = word.length()/2;

        System.out.println(word.charAt(middle));
    }
}
