#include<iostream>
using namespace std;
int sum(int n)
{
  if(n!=0)
    return n+sum(n-1);
  else
    return n;
}
int main()
{
  int n;
  cin>>n;  //5
  int res = sum(n);
  cout<<res; 
  return 0;
}

// 0 -> 0
//5 -> 1+2+3+4+5 =15
// 5+4+3+2+1+0(1-1)
//n+sum(n-1)

