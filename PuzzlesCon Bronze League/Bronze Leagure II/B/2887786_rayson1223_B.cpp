
#include<stdio.h>
#include <iostream>

using namespace std;


int main()
{
    string input;
    while(getline(cin , input)){
        for(int i = 0 ; i < input.length() ; i++){
            cout << char(input.at(i) -7) ;
        }
        cout << endl;
    }
}