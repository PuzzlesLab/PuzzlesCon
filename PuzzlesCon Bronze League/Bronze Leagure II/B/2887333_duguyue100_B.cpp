#include<iostream>
#include<cstdio>

using namespace std;

char ch;

int main(void)
{
	while (scanf("%c", &ch)!=EOF)
	{
		if (ch!='\n')
			cout << (char)(ch-7);
		else cout << ch;
	}
	return 0;
}
