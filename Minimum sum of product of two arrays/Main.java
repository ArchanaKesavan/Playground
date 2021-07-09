#include <iostream> 
using namespace std; 
int main() 
{ 
int n,k,i;
  cin>>n;
  int a[n],b[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
    cin>>b[i];
	cin>>k;
  	int diff = 0, res = 0; 
	int temp; 
	for (int i = 0; i < n; i++) 
    {  
		int pro = a[i] * b[i]; 
		res = res + pro; 
		if (pro < 0 && b[i] < 0) 
			temp = (a[i] + 2 * k) * b[i];  
		else if (pro < 0 && a[i] < 0) 
			temp = (a[i] - 2 * k) * b[i]; 
		else if (pro > 0 && a[i] < 0) 
			temp = (a[i] + 2 * k) * b[i]; 
		else if (pro > 0 && a[i] > 0) 
			temp = (a[i] - 2 * k) * b[i]; 
		int d =pro - temp; 
		if (d > diff) 
			diff = d;		 
	} 
	cout <<res - diff<< endl; 
	return 0; 
} 
