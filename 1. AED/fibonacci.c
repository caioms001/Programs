#include <stdio.h>

int fibonacci(int n){
	if(n == 1 || n==2){
		return 1;
	}
	return fibonacci(n-2) + fibonacci(n-1);
}

int main(){
	printf("%d\n", fibonacci(38));
}