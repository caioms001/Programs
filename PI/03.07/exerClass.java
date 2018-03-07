import java.util.Scanner;

public class exerClass{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int number, sum = 0;
		System.out.print("Enter the number: ");
		number = entry.nextInt();
		for(int i = 1; i <= number/2; i++){
			if(number % i == 0){
				sum = sum + i;
			}
		}
		if(number == sum) {
			System.out.println("PERFECT");
		} else {
			System.out.println("NOT PERFECT");
		}
	}
}