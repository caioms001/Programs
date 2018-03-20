#include <stdio.h>
#include <stdlib.h>

void troca(int *x, int *y) { 
	printf("%p\n", x);
	int aux = *x;
	*x = *y;
	*y = aux; 
}
int main( ) { 
	int a=1, b=3;
	printf("a=%d\nb=%d\n", a, b); 
	troca(&a, &b);
	printf("Apos invocar a funcao troca\n"); 
	printf("a=%d\nb=%d\n", a, b);
}
