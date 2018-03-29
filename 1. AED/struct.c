#include <stdio.h>


struct ponto
{
    int x;
    int y;
};

int main()
{
    struct ponto p1 = {10,5};
    printf("%d\n", p1.x);
}