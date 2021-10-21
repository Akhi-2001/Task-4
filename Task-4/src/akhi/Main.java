package akhi;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the number want the sum of the number of divisor: ");
        int a = input.nextInt();
        int sum = calculator.divisorSum(a);
        System.out.println("The sum of divisors of the number " + a + " is: " + sum + "\n");

        System.out.print("Enter the number you want the factorial of: ");
        int b = input.nextInt();
        BigInteger factorial = calculator.findFactorial(b);
        System.out.println("The factorial of the number " + b + " is: " + factorial);
    }

}

    /*
    Name: Akhi Roy
    ID: 2012020150
    Section: D
    Email: cse_2012020150@lus.ac.bd
    Date: 16-10-2021

    */

