#include<iostream>
#include<cstdio>
#include<cmath>

using namespace std;

double n=0, k=0;

int main(void)
{
	while (cin >> k >> n)
	{
		cout << (int)round(powl(n, 1.0/k)) << endl;
	}

	return 0;
}


