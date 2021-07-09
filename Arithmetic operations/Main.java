#include <iostream>
using namespace std;
class arith
{
  public:
  int a1,a2,s1,s2,m1,m2,d1,d2;
  public:
  void get()
  {
    cin>>a1>>a2>>s1>>s2>>m1>>m2>>d1>>d2;
  }
  void process()
  {
    cout<<a1+a2<<endl<<s1-s2<<endl<<m1*m2<<endl<<d1/d2;
  }
};
int main() 
{
  arith a;
  a.get();
  a.process();
    return 0;
}