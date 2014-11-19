
#include<stdio.h>
#include <iostream>

using namespace std;


int main()
{
    
    long long n = -1;
    do{
        if(n>=0){
            cout << n*(n+1)/2+1 << endl;
        }
        cin >> n;
    }while(n>=0);
    
}