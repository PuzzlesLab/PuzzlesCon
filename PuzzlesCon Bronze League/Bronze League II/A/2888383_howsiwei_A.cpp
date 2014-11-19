#include <iostream>
#include <regex>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	string s;
	getline(cin, s, '\0');
	cout << regex_replace(s, regex("\"([^\"]*)\""), "``$1''");
	return 0;
}
