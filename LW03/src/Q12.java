import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to change :");
        String oldWord = sc.nextLine();

        System.out.println("Enter the replacement word :");
        String newWord = sc.nextLine();

        String result = sentence.replaceAll(oldWord, newWord);

        System.out.println("Updated sentence is :"+result);
    }
}
