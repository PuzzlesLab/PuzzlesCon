#include<iostream>
#include <stack> 

using namespace std;
 
 bool checkParentheses(string in){
 	stack<char> check;
 	for(int j = 0; j < in.length(); j++){
		if(in.at(j) == '[' || in.at(j) == '('){
			check.push(in.at(j));
		}
		else if(in.at(j) == ']' || in.at(j) == ')'){
			if (check.empty())  return false;  
            char temp = check.top();  
            if ((in.at(j) == ')' && temp != '(')  || (in.at(j) == ']' && temp != '['))  
            	return false;    
            check.pop();  
		}	
	}
	if(check.size() > 0){
		return false;
	}
	return true;
 }	
 
int main ()
{
        int n;
        string in;
        
        stack<char> check;
        
        cin>>n;
        getline(cin, in);
          
        while(n>0){
        	getline(cin, in);
        	
        	cout << (checkParentheses(in) ? "Yes" : "No") << endl;  
           	n--;  
        }
        return 0;
}