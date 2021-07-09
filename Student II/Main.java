#include <iostream>
using namespace std;
class student
{
  private:
  char name[30];
  int rn;
  int per;
  public:
   void getdata();
  void putdata();
};
void student :: getdata()
{
  cin>>name>>rn>>per;
}
void student :: putdata()
{
  cout<<name<<endl;
  cout<<rn<<endl<<per<<"%";
}
int main() 
{
   student s;
  s.getdata();
  s.putdata();
    return 0;
}