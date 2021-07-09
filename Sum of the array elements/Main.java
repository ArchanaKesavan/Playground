#include<iostream>
using namespace std;
int sum_a(int a[],int k,int l)
{
  if(k>=l)
    return 0;
  
  return a[k]+sum_a(a,k+1,l);
}
int main()
{
  int n,a[50],sum=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  sum=sum_a(a,0,n);
  cout<<sum;
}