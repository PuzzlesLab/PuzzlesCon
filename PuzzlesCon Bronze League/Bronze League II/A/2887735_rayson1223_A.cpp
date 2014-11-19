
#include<stdio.h>
#include <iostream>

using namespace std;


int main()
{
    string input;
    bool alter = true;
    while(getline(cin , input)){

        for(int i = 0 ; i < input.length() ; i++){
            if(input.at(i) == char(34) && alter){
                cout << "``" ;
                alter = false;
            }
            else if(input.at(i) == char(34) && !alter){
                cout << "\'\'";
                alter = true;
            }
            else{
                cout << input.at(i);
            }
        }
        cout << endl;
    }
    
}