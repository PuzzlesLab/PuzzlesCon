#include <stdio.h>

char c;
int main()
{
	while((c=getchar()) != EOF) {
		if(c == '\n') putchar(c);
		else putchar(c - 7);
	}
	return 0;
}