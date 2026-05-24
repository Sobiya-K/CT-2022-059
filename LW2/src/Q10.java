import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int MONTHS_IN_YEAR = 12;

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualRate = input.nextDouble();

        System.out.print("Enter loan period (years): ");
        int loanPeriod = input.nextInt();

        double monthlyInterestRate =
                annualRate / 100.0 / MONTHS_IN_YEAR;

        int numberOfPayments =
                loanPeriod * MONTHS_IN_YEAR;

        double monthlyPayment =
                (loanAmount * monthlyInterestRate) /
                        (1 - Math.pow(
                                1 / (1 + monthlyInterestRate),
                                numberOfPayments));

        double totalPayment =
                monthlyPayment * numberOfPayments;

        System.out.println("Monthly Payment = " + monthlyPayment);
        System.out.println("Total Payment = " + totalPayment);
    }

}
