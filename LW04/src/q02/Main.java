package q02;

import q01.Temperature;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        Temperature temperature = new Temperature();

        temperature.setFahrenheit(fahrenheit);

        System.out.println("The temperature in Celsius is: " + temperature.toCelsius());
    }
}
