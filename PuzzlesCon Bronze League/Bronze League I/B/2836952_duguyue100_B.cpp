#include<iostream>
#include<cstdio>
#include<cmath>

using namespace std;

int main(void)
{
	int n=0;
	cin >> n;
	for (int i=1;i<=n;i++)
	{
		int n1=0, n2=0;
		cin >> n1 >> n2;

		if ((n1+n2)%2==0 && (n1-n2)%2==0)
		{
			if ((n1+n2)/2>=0 && (n1-n2)/2>=0)
				cout << (n1+n2)/2 << " " << (n1-n2)/2 << endl;
			else cout << "impossible" << endl;
		}
		else cout << "impossible" << endl;
	}

	return 0;
}
