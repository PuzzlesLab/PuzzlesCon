#include <iostream>
#include <cstdio>
#include <vector>
#include <unordered_set>
using namespace std;

int main()
{
	vector<int> cars = {561, 1105, 1729, 2465, 2821, 6601, 8911, 10585, 15841, 29341, 41041, 46657, 52633, 62745, 63973};
	unordered_set<int> iscar;
	for (auto x: cars) {
		iscar.insert(x);
	}
	int n;
	while (cin >> n) {
		if (n == 0) {
			break;
		}
		printf(iscar.count(n) ? "The number %d is a Carmichael number.\n" : "%d is normal.\n", n);
	}
	return 0;
}
