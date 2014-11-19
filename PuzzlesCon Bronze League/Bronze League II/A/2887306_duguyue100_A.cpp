#include<iostream>
#include<cstdio>

using namespace std;

char ch;

int main(void)
{
	long count=0;
	while (scanf("%c", &ch)!=EOF)
	{
		if (ch=='\"')
		{
			if (count%2==0) cout << "``";
			else cout << "''";
			count++;
		}
		else cout << ch;
	}

	return 0;
}
