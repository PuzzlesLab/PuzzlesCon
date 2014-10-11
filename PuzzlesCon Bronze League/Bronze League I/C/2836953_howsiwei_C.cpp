#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;

int main()
{
	string s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
	string t = "A   3  HIL JM O   2TUVWXY51SE Z  8 ";
	vector<char> sid(128, -1);
	for (int i = 0; i < s.size(); i++) {
		sid[s[i]] = i;
	}
	vector<char> tid(128, -1);
	for (int i = 0; i < t.size(); i++) {
		tid[t[i]] = i;
	}
	string p;
	while (cin >> p) {
		bool ispal = true;
		bool ismir = true;
		for (int i = 0, j = p.size()-1; i <= j; i++, j--) {
			if (p[i] != p[j]) {
				ispal = false;
			}
			if (sid[p[i]] != tid[p[j]]) {
				ismir = false;
			}
		}
		string mes;
		if (!ismir) {
			mes = !ispal ? "is not a palindrome" : "is a regular palindrome";
		}
		else {
			mes = !ispal ? "is a mirrored string" : "is a mirrored palindrome";
		}
		printf("%s -- %s.\n\n", p.c_str(), mes.c_str());
	}
	return 0;
}
