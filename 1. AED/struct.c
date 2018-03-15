#include <stdio.h>
#include <stdlib.h>

struct ponto 
{
    int x;
    int y;
};

struct ponto criaPonto(int x, int y)
{
    struct ponto ptr;
    ptr.x = x;
    ptr.y = y;
    return ptr;
};

int main()
{
	struct ponto p = criaPonto(43,65);
    printf("%d", p.x);
    return 0;
}