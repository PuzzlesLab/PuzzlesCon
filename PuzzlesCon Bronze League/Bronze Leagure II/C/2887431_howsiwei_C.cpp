#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;

int main()
{
	long long n;
	while (cin >> n) {
		if (n < 0) {
			break;
		}
		printf("%lld\n", n*(n+1)/2+1);
	}
	return 0;
}
