#include <stdio.h>
#include <stdlib.h>

void teste(char msg []){
	printf("%lu\n", sizeof(int));
}

int main(){
	char testeS[] = "He";
	teste(testeS);
	return 0;
}