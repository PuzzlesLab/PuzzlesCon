//
//  main.cpp
//  C
//
//  Created by Maziar Kosarifar on 10/29/14.
//  Copyright (c) 2014 com.clrs. All rights reserved.
//

#include <iostream>
using namespace std;
int findTime (string time) {
    int n = time.length();
    string h;
    string m;
    bool t = false;
    for (int i = 0; i < n; i++){
        if (time[i] != ':'){
            if (!t) h += time[i];
            else m += time[i];
        }else t = true;
    }
    
    return atoi(h.c_str()) * 60 + atoi(m.c_str());
}


void ifCrash (int ms, int me, int ws, int we, int i){
    string good = "Hits Meeting";
    string bad = "Mrs Meeting";
    if (ms <= ws && ws <= me) cout << "Case " << i << ": " << bad;
    else if (ms  <= we && we <= me) cout << "Case " << i << ": " << bad;
    else if (ws <= ms && we >= me)cout << "Case " << i << ": " << bad;
    
    
    else cout << "Case " << i << ": " << good;
    
}
int main(int argc, const char * argv[]) {
    string mS, mE, wS, wE;
    int ms, me, ws, we;
    int n;
    cin >> n;
    for (int i = 1; i <= n; i ++){
        cin >> mS >> mE >> wS >> wE;
        ws= findTime (wS);
        we = findTime (wE);
        me = findTime (mE);
        ms = findTime (mS);
        
        
        //cout << findTime(ms.c_str());
        ifCrash (ms, me, ws, we, i);
        cout << endl;
    }
    
    
    
    return 0;
}
