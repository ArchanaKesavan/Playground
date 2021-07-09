#include <iostream> 
using namespace std; 
int sum(int K)  
{ 
    int sod = 0; 
    while (K) 
    { 
        sod += K % 10; 
        K /= 10; 
    } 
    return sod; 
} 
int difference(int N, int diff) 
{ 
    int low = 1, high = N; 
    while (low <= high)  
    { 
        int mid = (low + high) / 2; 
        if (mid - sum(mid) < diff)         
            low = mid + 1; 
       else        
            high = mid - 1;         
    } 
    return (N - high); 
} 
int main() 
{ 
    int N; 
  cin>>N;
    int diff ; 
  cin>>diff;
    cout << difference(N, diff);     
    return 0;  
} 