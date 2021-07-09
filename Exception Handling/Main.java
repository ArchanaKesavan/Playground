#include<iostream>
#include<string>
using namespace std;

int main()
{
     float num1, num2, ans;
     char Operator;
     try
     {
          //cout<<"\n Enter First Number   :  ";
          cin>>num1;
          if(num1==0)
               throw 0;
          //cout<<"\n Enter Operator       :  ";
          cin>>Operator;
          if(Operator != '+' && Operator != '-' &&
               Operator != '*' && Operator != '/')
          throw Operator;
         // cout<<"\n Enter Second Number  :  ";
          cin>>num2;
          switch(Operator)
          {
               case '+':
                    ans = num1 + num2;
                    break;
               case '-':
                    ans = num1 - num2;
                    break;
               case '*':
                    ans = num1 * num2;
                    break;
               case '/':
                    ans = num1 / num2;
                    break;
          }
          if(num2 == 0) 
               throw 0;
          cout<<num1<<" "<<Operator<<" "<<num2<<" = "<<ans;
     }
     catch(const char c)
     {
          cout<<"It is not a Valid Operator";
     }
     catch(const int n)
     {
          cout<<"Bad Operation";
     }
     return 0;
}
