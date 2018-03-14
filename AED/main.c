#include <stdio.h>
#include <stdlib.h>

int main()
{
	int num1, num2, div, rest;
	printf("Digite os dois números separados por espaço: ");
	scanf("%d%d", &num1, &num2);
    divResto(num1, num2, &div, &rest);

    printf("Endereco de i: %p\nEndereco de j: %p\n", &i, &j);
    pi = &i;
    pj = &j;
    printf("Conteudo pi: %p\nConteudo pj: %p\n", pi, pj);
    printf("Apontado por pi: %d\nApontado por pj: %d\n", *pi, *pj);
    return 0;
}

void divResto(int div1, int div2, int div, int *rest){

}