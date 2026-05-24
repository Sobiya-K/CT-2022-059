import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(100)+1;
        int guess = 0;

        System.out.println("Enter the number of words you want to guess: ");

        while (guess != num){
            System.out.println("Enter your guess :");
            guess = sc.nextInt();

            if(guess < num){
                System.out.println("Your guess is low!");
            }else if(guess > num){
                System.out.println("Your guess is high!");
            }else{
                System.out.println("Your guess is correct!");
            }
        }
    }
}