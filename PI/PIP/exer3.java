import java.util.Scanner;

public class exer3{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int grade1, grade2, average;
		System.out.print("Enter the grade 1: ");
		grade1 = entry.nextInt();
		System.out.print("Enter the grade 2: ");
		grade2 = entry.nextInt();
		average = (grade1 + grade2) / 2;
		if(average >= 7) {
			System.out.println("Approved!");
		}
		else if(average >= 4){
			System.out.println("Needs a recovery!");
		}
		else {
			System.out.println("Failed!");
		}
	}
}