#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;

int main()
{
	char c;
	bool isleft = true;
	while (cin.get(c)) {
		if (c != '"') {
			printf("%c", c);
		}
		else {
			printf("%s", isleft ? "``" : "''");
			isleft = !isleft;
		}
	}
	return 0;
}
