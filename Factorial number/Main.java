#include<iostream>
using namespace std;
class Factorial
{
  int fact=1,n;
  public:
  void getdata();
  void cal();
  void putdata();
};
  void Factorial::cal()
  {
   
      if(n==0||n==1)
      {
        cout<<n;
      }
      else 
     {
       while(n>0)
        {
          fact=fact*n;
          n--;
        }
     }
   }
void Factorial::getdata()
{
    cin>>n;
 }
void Factorial::putdata()
{
  cout<<fact;
  
}
  
int main()
{
  int n;
  Factorial f;
  f.getdata();
  f.cal();
  f.putdata();
	return 0;
}
