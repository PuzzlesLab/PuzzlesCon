#include <stdio.h>

typedef long long ll;
ll n, a;
int fer, prime;

int is_prime(int x)
{
	int i;
	for(i = 2; i * i <= x; i++)
		if(x % i == 0) return 0;
	return 1;
}

ll pow(ll x, ll n, ll mod)
{
	ll res = 1;
	while(n > 0) {
		if(n & 1) res = res * x % mod;
		x = x * x % mod;
		n >>= 1;
	}
	return res;
}

int main()
{
	while(scanf("%lld", &n), n) {
		prime = is_prime(n);
		if(prime) {
			printf("%lld is normal.\n", n);
			continue;
		}
	
		fer = 1;
		for(a = 2; a <= n - 1; a++)
			if(pow(a, n, n) != a) {
				fer = 0;
				break;
			}
		
		if(fer)
			printf("The number %lld is a Carmichael number.\n", n);
		else
			printf("%lld is normal.\n", n);
	}
	return 0;
}