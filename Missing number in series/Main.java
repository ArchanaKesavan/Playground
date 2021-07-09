#include<iostream>
using namespace std;
int mis(int arr[], int n)
{	
	int l=0,h=n-1;
	int d=(arr[n-1]-arr[0])/n;
	while (l<=h)
	{
	  int mid=h-(h-l)/2;
    	if(mid+ 1<n&&arr[mid + 1]-arr[mid]!=d)
			return arr[mid+1]-d;		
		if(mid-1>=0&&arr[mid]-arr[mid-1]!=d)
			return arr[mid-1]+d;
	if(arr[mid]-arr[0]!=(mid-0)*d)
			h=mid-1;
		else
			l=mid+1;
	}
}

int main()
{
int a;
 cin>>a;
  int arr[a];
  for(int i=0;i<a;i++)
    cin>>arr[i];
  int n = sizeof(arr) / sizeof(arr[0]);

	cout<<mis(arr, n);

	return 0;
}