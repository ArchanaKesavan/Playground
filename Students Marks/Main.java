#include <iostream>
using namespace std;
class base{
public:
  int roll,s1,s2;
  void get(){
  cin>>roll;
    cin>>s1;
    cin>>s2;
  }
};
class derived : public base{
	public:
  void display(){
  cout<<"Roll Number Is:"<<endl<<roll<<endl;
    cout<<"Subject 1:"<<s1<<endl;
     cout<<"Subject 2:"<<s2<<endl;
    cout<<"Total:"<<s1+s2;
  }
};
int main() 
{
   derived d;
  d.get();
  d.display();
    return 0;
}