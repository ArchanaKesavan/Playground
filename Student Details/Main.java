#include <iostream>
using namespace std;
class student
{
  public:
  string name;
  int rn,marks;
  public:
  void getinput()
  {
    cout<<"Enter name:"<<endl;
    cin>>name;
    cout<<"Enter roll number:"<<endl;
    cin>>rn;
    cout<<"Enter total marks outof 500:"<<endl;
    cin>>marks;
  }
  void display()
  {
    cout<<"Student details:"<<endl;
    cout<<"Name: "<<name<<endl;
    cout<<"Roll Number: "<<rn<<endl;
    cout<<"Total: "<<marks<<endl;
    cout<<"Percentage: "<<float(marks)/500*100<<endl;
  }
};
int main() 
{
  student s;
  s.getinput();
  s.display();
    return 0;
}