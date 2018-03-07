public class exerClass2{
	public static void main(String[] args) {
		int number, count = 0, primeNumbers = 0;
		for(number = 1; number <= 10000; number++){
			for(int i = 1; i <= number; i++){
				if(number % i == 0){
					count++;
				}
			}
			if(count == 2) {
				primeNumbers = primeNumbers + number;
			}
			count = 0;
		}
		System.out.println(primeNumbers);
	}
}