//
//  main.cpp
//  B
//
//  Created by Maziar Kosarifar on 10/11/14.
//  Copyright (c) 2014 com.clrs. All rights reserved.
//

#include <iostream>
#include <math.h>

using namespace std;
int main(int argc, const char * argv[]) {
    int n;
    int p, q;
    
    cin >> n;
    for (int i = 0; i < n; i++){
        cin >> p >> q;
        
        if(p<q || p%2!=q%2) cout << "impossible" << endl;
        else{
            int a = (p+q)>>1;
            int b = (p-q)>>1;
            cout << a << " " << b << endl;
        }
    }
    
    
    return 0;
}
