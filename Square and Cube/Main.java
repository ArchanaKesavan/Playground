#include<iostream>
using namespace std;
class inher
{
  public:
  int a,b;
  void get1()
  {
    cout<<"Enter an integer number: ";
  cin>>a;
  }
    void get2()
  {
    cout<<"Enter an integer number: ";
  cin>>b;
  }
};
class derived:public inher
{
public:
void square(int a)
{
cout<<"Square of "<<a<<" is: "<<a*a<<endl;
}
void cube(int b)
{
cout<<"Cube of "<<b<<" is: "<<b*b*b<<endl;
}
};
int main()
{
  derived d;
  d.get1();
   d.square(d.a);
    d.get2();
  d.cube(d.b);
}