#include<iostream>
#include<cstdio>
#include<map>

using namespace std;

map<char, char> b;
string str;

void init()
{
	b['A']='A';
	b['B']=' ';
	b['C']=' ';
	b['D']=' ';
	b['E']='3';
	b['F']=' ';
	b['G']=' ';
	b['H']='H';
	b['I']='I';
	b['J']='L';
	b['K']=' ';
	b['L']='J';
	b['M']='M';
	b['N']=' ';
	b['O']='O';
	b['P']=' ';
	b['Q']=' ';
	b['R']=' ';
	b['S']='2';
	b['T']='T';
	b['U']='U';
	b['V']='V';
	b['W']='W';
	b['X']='X';
	b['Y']='Y';
	b['Z']='5';
	b['1']='1';
	b['2']='S';
	b['3']='E';
	b['4']=' ';
	b['5']='Z';
	b['6']=' ';
	b['7']=' ';
	b['8']='8';
	b['9']=' ';
}

bool checkPali(string str)
{
	for (size_t i=0;i<str.length();i++)
	{
		if (str[i]!=str[str.length()-i-1])
			return false;
	}

	return true;
}

bool checkMirror(string str)
{
	for (size_t i=0;i<str.length();i++)
	{
		if (str[i]!=b[str[str.length()-i-1]])
			return false;
	}

	return true;
}

int main(void)
{
	init();
	while (cin >> str)
	{
		if (checkPali(str))
		{
			if (checkMirror(str))
				cout << str << " -- is a mirrored palindrome." << endl;
			else cout << str << " -- is a regular palindrome." << endl;
		}
		else
		{
			if (checkMirror(str))
				cout << str << " -- is a mirrored string." << endl;
			else cout << str << " -- is not a palindrome." << endl;
		}

		cout << endl;
	}
	return 0;
}
