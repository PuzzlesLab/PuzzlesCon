#include <iostream>
#include <cstdio>
#include <regex>
using namespace std;

int main()
{
	string s;
	getline(cin, s, '\0');
	s = regex_replace(s, regex("\"([^\"]*)\""), "``$1''");
	s = regex_replace(s, regex("\""), "``");
	printf(s.c_str());
	return 0;
}
