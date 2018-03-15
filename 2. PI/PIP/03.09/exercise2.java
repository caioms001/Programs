import java.util.Scanner;

public class exercise2{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int cash, n50, n10, n5, n1;
		n50 = n10 = n5 = n1 = 0;
		do {
			System.out.print("How much money do you want: ");
			cash = entry.nextInt();
			if (cash <= 0) {
				System.out.println("The value must be positive.");
			}
			else if (cash > 2000){
				System.out.println("The value must be lower than 2000.");
			}
		} while (cash <= 0 || cash > 2000);
		while(cash >= 50){
			cash = cash - 50;
			n50 += 1;
		}
		while(cash >= 10){
			cash = cash - 10;
			n10 += 1;
		}
		while(cash >= 5){
			cash = cash - 5;
			n5 += 1;
		}
		while(cash >= 1){
			cash = cash - 1;
			n1 += 1;
		}
		System.out.println("The number of 50 notes is " + n50);
		System.out.println("The number of 10 notes is " + n10);
		System.out.println("The number of 5 notes is " + n5);
		System.out.println("The number of 1 notes is " + n1);
	}
}