#include <iostream> 
using namespace std;
int main() 
{ 
	int cost;
  cin>>cost;
  int coins[9] = { 1, 2, 5, 10, 20,50, 100, 500, 1000 }; 
	int c[10]; 
	int i, k = 0; 
	for (i = 9- 1; i >= 0; i--) 
    { 
		while (cost >= coins[i]) 
        { 
			cost =cost - coins[i]; 
			c[k++] = coins[i]; 
		} 
	} 

	for (i = 0; i < k; i++) 
    { 
		cout<<c[i]<<"  "; 
	} 
	return 0; 
} 
