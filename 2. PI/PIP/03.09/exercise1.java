import java.util.Scanner;

public class exercise1{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int age, oldest = 0;
		for(int i = 0; i < 15; i++){
			System.out.print("Enter the age: ");
			age = entry.nextInt();
			if(age > oldest) {
				oldest = age;
			}
		}
		System.out.println("The oldest is: " + oldest);
	}
}