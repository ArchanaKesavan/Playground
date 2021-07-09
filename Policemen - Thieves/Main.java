#include<iostream>
using namespace std;
int main()
{
  int n,k,c=0,c1=0;
  cin>>n;
  char a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cin>>k;
  for(int i=0;i<n;i++)
  {
    if(a[i]=='P')
       c++;
    if(a[i]=='T')
      c1++;
  }
  if(c==c1)
 cout<<"Maximum thieves caught: "<<c;
 else if(c1>c)
   cout<<"Maximum thieves caught: "<<c;
  else if(c>c1)
    cout<<"Maximum thieves caught: "<<c1;
  return 0;
}