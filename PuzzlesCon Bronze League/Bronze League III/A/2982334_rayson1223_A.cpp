#include<iostream>
using namespace std;
 
void writeWave(int amplitude)
{
        for(int i = 1; i <= amplitude; i++){
                for(int ii = 1; ii <= i; ii++){
                        cout<<i;
                }
                cout<<endl;
        }
        for(int j = amplitude-1; j >= 1; j--){
                for(int jj = 1; jj<=j ; jj++){
                        cout<<j;
                }
                cout<<endl;
        }
}
 
int main ()
{
        int n , amp , freq;
        cin>>n;
        for(int i=0 ; i<n ; i++){
                if(i>0) cout<<endl;
                cin>>amp>>freq;
                for(int j=0 ; j<freq; j++){
                        if(j>0)cout<<endl;
                        writeWave(amp);
                }
        }
        return 0;
}