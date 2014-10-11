//
//  main.cpp
//  C
//
//  Created by Maziar Kosarifar on 10/11/14.
//  Copyright (c) 2014 com.clrs. All rights reserved.
//

#include <cstdio>
#include <iostream>
#include <map>


using namespace std;

map<char, char> m;

string line;
string s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
string r = "A   3  HIL JM O   2TUVWXY51SE Z  8 ";

bool mirrored(string a) {
    for(int i = 0; i < a.length() / 2 + a.length() % 2; i++) {
        if(a[a.length() - 1 - i] != m[a[i]])
            return false;
    }
    return true;
}

bool palindrome(string a) {
    for(int i = 0; i < a.length() / 2; i++) {
        if(a[a.length() - i - 1] != a[i])
            return false;
    }
    return true;
}

int main() {
    for(int i = 0; i < s.length(); i++)
        m[s[i]] = r[i];
    
    while(cin >> line) {
        bool mi = mirrored(line);
        bool pa = palindrome(line);
        
        if(!mi && !pa)
            printf("%s -- is not a palindrome.\n", line.c_str());
        else if(!mi && pa)
            printf("%s -- is a regular palindrome.\n", line.c_str());
        else if(mi && !pa)
            printf("%s -- is a mirrored string.\n", line.c_str());
        else
            printf("%s -- is a mirrored palindrome.\n", line.c_str());
        printf("\n");
    }
}