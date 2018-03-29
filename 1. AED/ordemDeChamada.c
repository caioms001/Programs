#include <stdio.h>

void conta(int n){
	if(n > 0){
		printf("%d\n", n);
		conta(n-1);
	}
}

int main(){
	conta(3);
}