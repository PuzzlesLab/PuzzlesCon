//
//  main.cpp
//  A
//
//  Created by Maziar Kosarifar on 10/11/14.
//  Copyright (c) 2014 com.clrs. All rights reserved.
//

#include<iostream>
#include<cmath>
using namespace std;
int main(){
    int n;
    double p,k;
    int ans;
    while(cin>>n>>p){
        k=exp(log(p)/n);
        ans=round(k);
        cout<<ans<<endl;
    }
    return 0;
}