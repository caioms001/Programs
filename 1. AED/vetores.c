#include <stdio.h>

int main (void) {
	int idade[10] = {1,2,3,4,5,6,7,8,9,10};
	printf("*vetor: %d\n", *(idade+1));
	// printf("*vetor + 1: %d\n",*(vetor+1));
	// printf("vetor: %p\n", vetor);
	printf("&vetor[0]: %p\n", &idade[0]);
	// printf("%d\n", vetor[6]);
}