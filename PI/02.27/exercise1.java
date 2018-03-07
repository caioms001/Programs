import java.util.Scanner;

public class exercise1{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int number1 = entry.nextInt();
		int div1 = number1%2;
		if (div1 == 0) {
			System.out.println("The number entered is even.");
		} else {
			System.out.println("The number entered is odd.");
		}
	}
}