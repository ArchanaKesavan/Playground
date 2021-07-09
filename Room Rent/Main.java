#include<iostream>
using namespace std;
class inher
{
 public:
  int rent_amt;
  int ram_rem;
  int sathish_rem;
  void get()
  {
  cout<<"The total amount of the rent is :"<<endl;
    cin>>rent_amt;
    cout<<"Remaining money from Ram's salary:"<<endl;
    cin>>ram_rem;
    cout<<"Remaining money from Sathish's salary:"<<endl;
    cin>>sathish_rem;
  }
};

class arrange:public inher
{
public:
    void rent()
    {
    cout<<"To pay the rent amount they need to arrange : "<< (rent_amt-(ram_rem+sathish_rem))<<"Rs"<<endl;
    }
};
int main()
{
  arrange a;
  a.get();
  a.rent();
  return 0;
}