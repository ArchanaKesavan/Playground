#include<iostream>
using namespace std;
class base1
{
  public:
  char name[20];
  int age;
  char gen;
  void get_basic()
  {
    cout<<"Enter student's basic information:"<<endl;
    cout<<"Name:"<<endl;
    cin>>name;
    cout<<"Age:"<<endl;
    cin>>age;
    cout<<"Gender:"<<endl<<endl;
    cin>>gen;
  }
};
class base2
{
  public:
  int mar;
  char grade;
  void get_result()
  {
    cout<<"Enter student's result information:"<<endl;
    cout<<"Total Marks:"<<endl;
    cin>>mar;
    cout<<"Grade:"<<endl;
    cin>>grade;
  }
};
class derived : public base1,public base2
{
public:
void display()
{
cout<<"Name: "<<name<<endl;
cout<<"Age: "<<age<<endl;
cout<<"Gender: "<<gen<<endl;
cout<<"Total Marks: "<<mar<<endl;
cout<<"Percentage: "<<(int)mar/5<<endl;
cout<<"Grade: "<<grade<<endl;
}
};
int main()
{
 derived d;
  d.get_basic();
  d.get_result();
  d.display();
}