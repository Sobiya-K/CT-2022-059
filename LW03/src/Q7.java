import java.util.Scanner;

public class Q7 {
    public static int countDigits(int num){
        int countn = 0;
        if(num == 0){
            return 1;
        }
        while(num != 0){
            num = num/10;
            countn++;
        }
        return countn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter an integer number :");
            int num = sc.nextInt();
            if (num<0){
                break;
            }
            int digits = countDigits(num);
            System.out.println("number of digits :" + digits);
        }
    }
}