import java.util.Scanner;
import java.lang.Math;

public class exer5{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		double number;
		System.out.print("Enter the number: ");
		number = entry.nextDouble();
		System.out.println(number + " is approximately " + Math.round(number));
		System.out.println("The ceiling of " + number + " is " + Math.ceil(number));
	}
}