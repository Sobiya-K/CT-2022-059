import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word :");
        String text =sc.nextLine();

        boolean palindrome = true;

        int start = 0;
        int end = text.length()-1;

        while(start < end){
            if (text.charAt(start) != text.charAt(end)){
                palindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(palindrome){
            System.out.println("It's Palindrome");
        }else{
            System.out.println("It's Not Palindrome");
        }
    }
}