#include<stdio.h>
#define max 100000

int main()
{
    long int i;
    char str[max];
    while(gets(str))

    {
        for(i=0;str[i]!='\0';i++)
        {
            printf("%c",str[i]-7);
        }
        printf("\n");
    }
    return 0;
}