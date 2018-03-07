import java.util.Scanner;
import java.lang.Math;

public class exer9{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		double number;
		System.out.print("Enter the number: ");
		number = entry.nextDouble();
		System.out.println("The square root of " + number + " is " + Math.sqrt(number));
	}
}