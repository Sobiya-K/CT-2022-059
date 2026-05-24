import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a =input.nextInt();
        System.out.println("Enter the Second Number: ");
        int b =input.nextInt();
        System.out.println("Enter the Third Number: ");
        int c = input.nextInt();

        int smallest = a;
        if(smallest>=b){
            smallest=b;
        } else if (smallest>=c){
            smallest=c;
        }

        System.out.println("Smallest number is: "+ smallest);

    }
}
