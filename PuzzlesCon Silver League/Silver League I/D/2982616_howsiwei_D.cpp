#include <iostream>
#include <cstdio>
#include <vector>
#include <unordered_map>
#include <cmath>
using namespace std;

const int oo = 1<<30;
const int maxb = 801;
vector<unordered_map<int,int>> factorzs(maxb);

int nzero(int n, int b)
{
	int ret = oo;
	for (auto x: factorzs[b]) {
		int p = x.first;
		int pb = x.second;
		int pn = 0;
		int tmp = n;
		while (tmp != 0) {
			tmp /= p;
			pn += tmp;
		}
		ret = min(ret, pn/pb);
	}
	return ret;
}

int ndigit(long double n, long double b)
{
	const long double tau = 2*3.1415926535897932384626;
	if (n == 0) {
		return 1;
	}
	return (0.5*log(tau*n)+n*log(n)-n+log(1+1/(12*n)+1/(288*n*n)))/log(b)+1;
}

int main()
{
	for (int i = 2; i < maxb; i++) {
		for (int j = 2; ; j++) {
			if (i%j == 0) {
				factorzs[i] = factorzs[i/j];
				factorzs[i][j]++;
				break;
			}
		}
	}
	int n, b;
	while (cin >> n) {
		cin >> b;
		printf("%d %d\n", nzero(n, b), ndigit(n, b));
	}
	return 0;
}
