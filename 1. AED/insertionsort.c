#include <stdio.h>

void insertion(int *vetor, int n)
{
	int chave, i, j;
	for(i=1; i<n; i++)
	{
		chave = vetor [ i ];
		j = i-1;
		while(j >= 0 && vetor[j] >= chave) {
			vetor [ j+1 ] = vetor [ j ];
			vetor [ j ] = chave;
			j=j-1;
		} 
	}
	for(int i3 = 0; i3 < n; ++i3)
	{
		printf("%d\n", vetor[i3]);
	}
}

int main(){
	int vetor[8] = {8, 7, 6, 5, 4, 3, 2, 1};
	insertion(vetor, 8);
}