public class exerClass1{
	public static void main(String[] args) {
		int number, sum = 0;
		for(number = 1; number <= 10000; number++) {
			for(int i = 1; i <= number/2; i++){
				if(number % i == 0){
					sum = sum + i;
				}
			}
			if(number == sum) {
				System.out.println(number + " is a perfect number.");
			}
			sum = 0;
		}
	}
}