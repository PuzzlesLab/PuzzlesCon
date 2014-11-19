#include<iostream>
#include<cstdio>

using namespace std;

long n=0;

int main(void)
{
	while (cin >> n && n>=0)
	{
		cout << (n*(n+1))/2+1 << endl;
	}

	return 0;
}
