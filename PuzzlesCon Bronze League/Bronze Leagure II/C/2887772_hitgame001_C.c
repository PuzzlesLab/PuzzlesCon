#include <stdio.h>

long long n;

int main()
{
	while(scanf("%lld", &n), n >= 0) {
		printf("%lld\n", (1 + n) * n / 2 + 1);
	}
	return 0;
}