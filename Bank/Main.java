#include <iostream>
using namespace std;
class bank
{
  public:
  char name[30],atype[30];
  int ano,bal,dep_amt,w_amt;
  public:
  void acc()
  {
    cout<<"Enter Details:"<<endl<<"Account No."<<endl;
    cin>>ano;
    cout<<"Name :"<<endl;
    cin>>name;
    cout<<"Account Type :"<<endl;
    cin>>atype;
    cout<<"Balance :"<<endl;
    cin>>bal;
    cout<<"Enter Deposit Amount ="<<endl;
    cin>>dep_amt;
    cout<<"Enter Withdraw Amount ="<<endl;
    cin>>w_amt;
    if((bal+dep_amt)<w_amt)
      cout<<"Cannot Withdraw Amount"<<endl;
    cout<<"Accout No. : "<<ano<<endl;
    cout<<"Name : "<<name<<endl;
    cout<<"Account Type : "<<atype<<endl;
    cout<<"Balance : "<<(bal+dep_amt)-w_amt<<endl;
  }
};
int main() 
{
   bank b;
  b.acc();
    return 0;
}