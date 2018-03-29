#include <stdio.h>

int busca(int *v, int n, int x)
{	
    int i;
    for(i=0; i<n; i++){
		if(v[i] == x) {
			return i; 
		}
	}
	return -1; 
}

int main(){
	int vetor[10] = {1,2,3,4,5,6,7,8,9,10};
	printf("O índice é: %d\n", busca(vetor, 10, 11));
	return 0;
}