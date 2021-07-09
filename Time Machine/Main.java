#include <iostream>
using namespace std;
class Time
{
  public:
  int h1,m1,s1,h2,m2,s2,h,m,s;
 public:
  void gettime()
  {
    cout<<"Enter time:"<<endl;
    cout<<"Hours :"<<endl;
    cin>>h1;
    cout<<"Minutes :"<<endl;
    cin>>m1;
    cout<<"Seconds :"<<endl;
    cin>>s1;
    cout<<"Enter time:"<<endl;
    cout<<"Hours :"<<endl;
    cin>>h2;
    cout<<"Minutes :"<<endl;
    cin>>m2;
    cout<<"Seconds :"<<endl;
    cin>>s2;
  }
  void addtime()
  {
    s=s1+s2;
    m=m1+m2+(s/60);
    h=h1+h2+(m/60);
    m=m%60;
    s=s%60;
    cout<<"Time after add: "<<h<<":"<<m<<":"<<s;
  }
};
int main() 
{
  Time t;
  t.gettime();
  t.addtime();
    return 0;
}