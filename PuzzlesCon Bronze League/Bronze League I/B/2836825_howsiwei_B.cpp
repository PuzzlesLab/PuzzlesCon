#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;

int main()
{
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		int sum, dif;
		cin >> sum >> dif;
		if (sum < dif or (sum-dif)%2 != 0) {
			puts("impossible");
			continue;
		}
		printf("%d %d\n", (sum+dif)/2, (sum-dif)/2);
	}
	return 0;
}
