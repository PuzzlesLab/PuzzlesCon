#include <stdio.h>

int main()
{
	int T, s, d, a, b;
	scanf("%d", &T);
	while(T--) {
		scanf("%d%d", &s, &d);
		a = s + d;
		b = s - d;
		if(!(a % 2) && !(b % 2) && a >=0 && b >= 0)
			printf("%d %d\n", a / 2, b / 2);
		else
			printf("impossible\n");
	}
	return 0;
}