#include<iostream>
using namespace std;
class gp
{
  public:
  char name[20];
  void get1()
  {
    cout<<"Enter the grand parent name:"<<endl;
    cin>>name;
  }
};
class f:public gp
{
  public:
  char name1[20];
  void get2()
  {
    cout<<"Enter the father name:"<<endl;
    cin>>name1;
  }
};
class s:public f
{
  public:
  char name2[20];
  void get3()
  {
    cout<<"Enter the son name:"<<endl;
    cin>>name2;
  }
};
int main()
{
 s s;
  s.get3();
  s.get2();
  s.get1();
  return 0;
}