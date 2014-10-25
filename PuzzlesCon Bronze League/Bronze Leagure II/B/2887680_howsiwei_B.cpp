#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;

int main()
{
	string s;
	while (getline(cin, s)) {
		for (auto& x: s) {
			x -= 7;
		}
		puts(s.c_str());
	}
	return 0;
}
