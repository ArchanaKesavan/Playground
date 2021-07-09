#include <iostream>
using namespace std;
class sum
{
  public:
  int n;
  int digit_sum(int);
};
int sum :: digit_sum(int x)
{
  int rem,sum=0;
  while(x>0)
  {
    rem = x%10;
    sum += rem;
    x /=10;
  }
  return sum;
}
int main() 
{
   sum s;
  cin>>s.n;
  cout<<s.digit_sum(s.n);
    return 0;
}