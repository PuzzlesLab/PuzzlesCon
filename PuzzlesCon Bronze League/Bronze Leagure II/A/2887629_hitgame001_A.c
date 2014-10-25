#include <stdio.h>
#define IN		0
#define OUT		1
char c;
int state;
int main()
{
	state = OUT;
	while((c = getchar()) != EOF) {
		if(c == '\"') {
			if(state == OUT) {
				printf("``");
				state = IN;
			} else {
				printf("''");
				state = OUT;
			}
		} else
			putchar(c);
	}
	return 0;
}