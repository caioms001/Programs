import java.util.Scanner;
import java.lang.Math;

public class exer6{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		double number;
		System.out.print("Enter the number: ");
		number = entry.nextDouble();
		System.out.println("The floor of " + number + " is " + Math.floor(number));
	}
}