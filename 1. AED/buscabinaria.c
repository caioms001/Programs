#include <stdio.h>

int buscaBin(int *v, int n, int x) {
	int esq=0, dir=n-1, meio;
	while(esq<=dir){
		meio = (esq+dir)/2; 
		if(v[meio] == x){
			return meio;
		}
		else if(v[meio] > x){
			dir = meio-1; 
		}
		else if(v[meio] < x){
			esq = meio + 1;
		}
	}
	return -1; 
}

int main(){
	int vetor[10] = {1,2,3,4,5,6,7,8,9,10};
	printf("O índice é: %d\n", buscaBin(vetor, tamanho, 5));
	return 0;
}