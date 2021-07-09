 #include<iostream> 
using namespace std;
int main() 
{ 
  int n,k;
  cin>>n;
  int s[n],f[n];
	for(k=0;k<n;k++)
      cin>>s[k];
  for(k=0;k<n;k++)
      cin>>f[k];
	
  int i, j; 
	i = 0; 
	cout<<i<<" "; 
	for (j = 1; j < n; j++) 
	{ 
	if (s[j] >= f[i]) 
	{ 
		cout<<j<<" "; 
		i = j; 
	} 
	} 
	return 0; 
} 
