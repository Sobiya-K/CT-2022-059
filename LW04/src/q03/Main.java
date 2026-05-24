package q03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the radius of the inner circle: ");
        double ri = scanner.nextDouble();
        System.out.print("Enter the radius of the outer circle: ");
        double ro = scanner.nextDouble();


        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double area =  outerCircle.computeArea() - innerCircle.computeArea();


        System.out.println("The area of the circular region is " + area);
    }
}
