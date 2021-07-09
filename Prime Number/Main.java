#include <iostream>
using namespace std;
class check
{
  public:
  long n;
  void prime_or_not(int);
};
void check :: prime_or_not(int x)
{
  int i,flag = 0,m=0;
  m=x/2;
  for(i=2;i<= m;i++)
  {
    if(n%i == 0)
    {
      cout<<"Not Prime";
    flag = 1;
    break;
    }
  }
  if(flag == 0)
    cout<<"Prime";
}
int main() 
{
 check obj;
  	cin>>obj.n;
  	obj.prime_or_not(obj.n);
	return 0;
}