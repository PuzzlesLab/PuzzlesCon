#include <iostream>
#include <regex>
using namespace std;

int main()
{
	string s;
	getline(cin, s, '\0');
	cout << regex_replace(s, regex("\"([^\"]*)\""), "``$1''");
	return 0;
}
