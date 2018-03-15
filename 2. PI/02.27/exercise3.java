import java.util.Scanner;

public class exercise3{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int temp = entry.nextInt();
		if (temp > 30) {
			System.out.println("Very hot temperature.");
		} 
		else if (temp > 10) {
			System.out.println("Pleasant temperature.");
		}
		else{
			System.out.println("Very cold temperature.");
		}
	}
}