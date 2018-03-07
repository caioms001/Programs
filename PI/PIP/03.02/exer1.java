import java.util.Scanner;

public class exer1{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int number;
		System.out.print("Enter the number: ");
		number = entry.nextInt();
		if(number < 0) {
			number = number * -1;
		}
		number = number * 3;
		System.out.println(number);
	}
}