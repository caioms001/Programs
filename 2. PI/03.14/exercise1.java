import java.util.Scanner;

public class exercise1{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int lowerBound, upperBound, sum = 0;
		System.out.print("Enter the lower bound: ");
		lowerBound = entry.nextInt();
		do{
			System.out.print("Enter the upper bound: ");
			upperBound = entry.nextInt();
			if(upperBound <= lowerBound){
				System.out.println("Fail! The Upper bound is lower than lower bound.");
			}
		} while (upperBound <= lowerBound);
		for(int i = lowerBound; i <= upperBound; i++){
			if ((i % 2) == 0) {
				sum += i;
			}
		}
		System.out.println("The sum of all even numbers is " + sum);
	}
}