import java.util.Scanner;
import java.lang.Math;

public class exer4{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int number;
		System.out.print("Enter the number: ");
		number = entry.nextInt();
		System.out.println("| " + number + " | is " + Math.abs(number));
	}
}