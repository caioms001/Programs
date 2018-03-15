import java.util.Scanner;

public class exercise5{
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int number, flag = 0, count = 0;
		System.out.print("Enter a number: ");
		number = entry.nextInt();
		while(flag == 0){
			for(int i = 1; i <= number; i++){
				if(number % i == 0){
					count++;
				}
			}
			if(count == 2) {
				flag = 1;
			} else {
				number--;
			}
			count = 0;
		}
		System.out.println("The last prime number before the entered number is " + number);
	}
}