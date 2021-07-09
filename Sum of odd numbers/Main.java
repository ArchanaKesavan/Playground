#include<iostream>
using namespace std;
void SumOfOdd(int a[],int num,int sum)
{
  if(num>=0)
  {
    if((a[num])%2==1)
    {
      sum+=(a[num]);
    }
    SumOfOdd(a,num-1,sum);
  }
  else
  {
    cout<<"Enter the number of elements in the array"<<endl;
    cout<<"Enter the elements in the array"<<endl;
    cout<<"The sum of the odd elements in the array is "<<sum;
    return;
  }
}
int main()
{
  //Type your code here.
  int i,a[100],num,sum=0;
  cin>>num;
  for(i=0;i<num;i++)
  {
    cin>>a[i];
  }
  SumOfOdd(a,num-1,sum);
}