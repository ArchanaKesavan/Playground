#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float p,n,r;
  cin>>p>>n>>r;
  float si,amt,dis,tot;
  si=(p*n*r)/100;
  amt=p+si;
  dis=si*0.02;
  tot=amt-dis;
  cout<<fixed<<setprecision(2)<<si<<endl;
   cout<<fixed<<setprecision(2)<<amt<<endl;
   cout<<fixed<<setprecision(2)<<dis<<endl;
   cout<<fixed<<setprecision(2)<<tot<<endl;
    //<<amt<<endl<<dis<<endl<<tot;
}