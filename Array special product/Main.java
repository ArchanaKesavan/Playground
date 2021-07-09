#include<iostream>
using namespace std;
void pro(int arr[], int n)
{
	int l[n], r[n];
	l[0]=1;
	for (int i=1;i<n;i++)
		l[i]=arr[i-1]*l[i-1];
  r[n-1]=1;
	for (int j=n-2;j>=0;j--)
		r[j] = arr[j+1]*r[j+1];
	for (int i=0;i<n;i++)
		arr[i]=l[i]*r[i];
}
int main()
{
  int a;
  cin>>a;
	int arr[a]; 
  for(int i=0;i<a;i++)
    cin>>arr[i];
	int n = sizeof(arr)/sizeof(arr[0]);
	pro(arr,n);
	for (int i=0;i<n;i++)
		cout<<arr[i]<<endl;

	return 0;
}