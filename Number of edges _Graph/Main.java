#include<stdio.h>
int GraphtotalEdge(int n) 
{ 
    int result = 0; 
    result = (n * (n - 1)) / 2; 
    return result; 
} 
int main() 
{ 
    int n;
    scanf("%d", &n);
    printf("%d", GraphtotalEdge(n)); 
    return 0; 
}