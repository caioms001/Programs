import java.util.Scanner;

public class exer2{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int age;
		System.out.print("Enter the age: ");
		age = entry.nextInt();
		if(age > 17) {
			System.out.println("Adults");
		}
		else if (age >= 14) {
			System.out.println("Juveline B");
		}
		else if (age >= 12) {
			System.out.println("Juvenile A");
		}
		else if (age >= 8) {
			System.out.println("Infant B");
		}
		else if(age >= 5) {
			System.out.println("Infant A");
		}
	}
}