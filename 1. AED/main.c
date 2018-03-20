#include <stdio.h>
#include <stdlib.h>

int soma(int a, int b){
    int x;
    x = a + b;
    return x;
}

int main()
{
	int num1, num2, result;
    printf("Digite o primeiro número: ");
    scanf("%d", &num1);
    printf("Digite o segundo número: ");
    scanf("%d", &num2);
    result = soma(num1, num2);
    printf("%s\n", );
    printf("O resultado é: %d\n", result);
}