#include<stdio.h>

 
void calculateSpan(int price[], int n, int S[])
{
    
    S[0] = 1;
 
    
    for (int i = 1; i < n; i++)
    {
        S[i] = 1; 
 
        
        for (int j = i - 1; (j >= 0) &&
                (price[i] >= price[j]); j--)
            S[i]++;
    }
}
 

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d\n",arr[i]);
}
 

int main()
{
    int price[] = {100,80,60,70,60,75,85 };
    int n = sizeof(price) / sizeof(price[0]);
    int S[n];
 
   
    calculateSpan(price, n, S);
 
    // print the calculated span values
    printArray(S, n);
 
    return 0;
}