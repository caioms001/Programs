#include <stdio.h>
#include <stdlib.h>

void teste(char msg []){
	printf("%lu\n", sizeof(msg));
}

int main(){
	char testeS[] = "He";
	teste(testeS);
	return 0;
}
