import java.util.Scanner;
import java.lang.Math;

public class exer8{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		double number1, number2;
		System.out.print("Enter the number 1: ");
		number1 = entry.nextDouble();
		System.out.print("Enter the number 2: ");
		number2 = entry.nextDouble();
		System.out.println("pow(" + number1 + ", " + number2 + ") is " + Math.pow(number1, number2));
	}
}