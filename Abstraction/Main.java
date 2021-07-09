#include<iostream>
using namespace std;
class abc
{
  private:
  friend void func(int,int);
};
void func(int a,int b)
{
  cout<<"a = "<<a<<endl;
  cout<<"b = "<<b<<endl;
}
int main()
{
  abc o;
  int a,b;
  cin>>a>>b;
  func(a,b);
  return 0;
}