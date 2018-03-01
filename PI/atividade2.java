import java.util.Scanner;

public class atividade2{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int number1 = entry.nextInt();
		int number2 = entry.nextInt();
		int div1 = number2%2;
		int div2 = number2%2;
		if (div1 == 0 && div2 == 0) {
			System.out.println("The two numbers entered are even.");
		}
		if else (div1 == 1 && div2 == 1) {
			System.out.println("The two numbers entered are odd.");
		}
		else {
			System.out.println("One number is even and the other number is odd.");
		}
	}
}