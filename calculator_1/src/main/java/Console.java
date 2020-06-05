import com.epam.calculator_1.*;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("Addition of two numbers: "+calculator.add(num1,num2));

        System.out.println("Subtraction of two numbers: "+calculator.subtract(num1,num2));

        System.out.println("Multiplication of two numbers: "+calculator.multiply(num1,num2));

        System.out.println("Division of two numbers: "+calculator.divide(num1,num2));
        sc.close();
    }
}