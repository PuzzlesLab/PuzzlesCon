//
//  main.cpp
//  D
//
//  Created by Maziar Kosarifar on 10/11/14.
//  Copyright (c) 2014 com.clrs. All rights reserved.
//


#include <iostream>
#include <cmath>
#include <string>
#include <cstdio>

using namespace std;

int n;
int i_o[10] = { 0, 1, 2, 3, 1, 0, 1, 2, 3, 1 };
int v_o[10] = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 0 };
int x_o[10] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };

int x_t[11] = { 0, 1, 2, 3, 1, 0, 1, 2, 3, 1, 0 };
int l_t[11] = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0 };
int c_t[11] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 };

int i[110], v[110], x[110], l[110], c[110];

int main() {
    i[0] = v[0] = x[0] = l[0] = c[0] = 0;
    for(int count = 1; count <= 100; count++) {
        i[count] += i[count - 1] + i_o[count % 10];
        v[count] += v[count - 1] + v_o[count % 10];
        x[count] += x[count - 1] + x_o[count % 10] + x_t[count / 10];
        l[count] += l[count - 1] + l_t[count / 10];
        c[count] += c[count - 1] + c_t[count / 10];
    }
    
    cin >>n;
    while (n != 0){
        printf("%d: %d i, %d v, %d x, %d l, %d c\n", n, i[n], v[n], x[n], l[n], c[n]);
        cin >> n;
    }
}