import java.util.Scanner;

public class exercise3{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int number;
		do{
			System.out.print("Enter the number: ");
			number = entry.nextInt();
			if (number >= 0){
				if (number % 2 == 0) {
					System.out.println("The number is even.");
				} else {
					System.out.println("The number is odd.");
				}
			}
		} while (number >= 0);
	}
}