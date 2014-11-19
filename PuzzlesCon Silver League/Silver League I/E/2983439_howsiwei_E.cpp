#include <iostream>
#include <cstdio>
#include <vector>
#include <cmath>
using namespace std;

const int maxn = int(1e5)/2;

int main()
{
	vector<long double> f(maxn);
	f[0] = 1;
	for (int i = 1; i < f.size(); i++) {
		f[i] = f[i-1]-f[i-1]/(2*i);
	}
	int nT;
	cin >> nT;
	for (int T = 0; T < nT; T++) {
		int n;
		cin >> n;
		printf("%.4Lf\n", 1-f[n/2-1]);
	}
	return 0;
}
