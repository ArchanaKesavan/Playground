#include<iostream>
using namespace std;
class base
{
  public:
  int side;
  void get()
  {
    cout<<"Enter the side :"<<endl;
    cin>>side;
  }
};
class derived:public base
{
public:
void display()
{
cout<<"The square value is : "<<side*side<<endl;
cout<<"The cube value is : "<<side*side*side<<endl;
}
};
int main()
{
  derived d;
  d.get();
  d.display();
}