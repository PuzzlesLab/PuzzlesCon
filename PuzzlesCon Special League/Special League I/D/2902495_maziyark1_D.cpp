//
//  main.cpp
//  d
//
//  Created by Maziar Kosarifar on 10/29/14.
//  Copyright (c) 2014 com.clrs. All rights resulterved.
//

#include <iostream>
using namespace std;


long long f[200];

int findResult(long long L) {
    if(L == 0) return 0;
    for (int i = 0; i < 120; i++) if(f[i] > L) return 1 + findResult(L-f[i-1]);
    return 0;
}

int main() {
    int  T, N, n = 1;
    
    long long result = 1;
    long long length;
    
    f[0] = 1; f[1] = 2;
    for(int i = 2; i < 150; i++) f[i] = f[i-1] + f[i-2];
    
    
    //cout << f[110] << endl;
    cin >> T;
    for (int i=1; i <= T; i++){
        cin >> N;
        for (int j = 0; j < N; j++) {
            cin >> length;
            result *= findResult(length);
         //   cout << result << " " ;
        }
        cout << "Case " << i << ": " << result << endl;
        result = 1;
    }
    return 0;
}