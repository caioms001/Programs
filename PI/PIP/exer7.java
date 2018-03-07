import java.util.Scanner;
import java.lang.Math;

public class exer7{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		double number1, number2;
		System.out.print("Enter the number 1: ");
		number1 = entry.nextDouble();
		System.out.print("Enter the number 2: ");
		number2 = entry.nextDouble();
		System.out.println("min(" + number1 + "," + number2 + ") is " + Math.min(number1, number2));
		System.out.println("max(" + number1 + "," + number2 + ") is " + Math.max(number1, number2));
	}
}