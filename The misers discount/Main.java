#include<iostream>
using namespace std;
int main()
{
 float itm1,itm2,dis;
  float tot,d,out;
  cin>>itm1>>itm2>>dis;
  tot = itm1 + itm2;
  d = tot * (dis*0.01);
  out = tot - d;
  cout<<tot<<endl<<out<<endl<<d;
  return 0;
}