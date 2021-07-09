#include<iostream>
using namespace std;
struct employee
{
  char a[20],de[20];
  int eid,age,sal;
};

int main()
{
  struct employee e1;
  cout<<"Enter name:"<<endl;
  cin>>e1.a;
  cout<<"Enter ID:"<<endl;
  cin>>e1.eid;
  cout<<"Enter age:"<<endl;
  cin>>e1.age;
  cout<<"Enter designation:"<<endl;
  cin>>e1.de;
  cout<<"Enter Salary:"<<endl;
  cin>>e1.sal;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<e1.a<<endl;
  cout<<"ID of the Employee : "<<e1.eid<<endl;
  cout<<"Age of the Employee : "<<e1.age<<endl;
  cout<<"Designation of the Employee : "<<e1.de<<endl;
  cout<<"Salary of the Employee : "<<e1.sal<<endl;
  
  
}