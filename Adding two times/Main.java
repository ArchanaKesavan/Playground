#include <iostream>
using namespace std;
class Time
{
  private:
  int h,m,s;
  public:
  void gettime(void);
    void addtime(Time t1,Time t2);
  void puttime(void);
};
void Time::gettime(void)
{
  cin>>h>>m>>s;
}
void Time::addtime(Time t1,Time t2)
{
  m=0;
  s=0;
  s = t1.s+t2.s;
  m = t1.m+t2.m+(s/60);
  h = t1.h+t2.h+(m/60);
  m = m%60;
  s = s%60;
}
void Time::puttime(void)
{
  cout<<h<<":"<<m<<":"<<s;
}
int main() 
{
   Time t1,t2,t3;
  t1.gettime();
  t2.gettime();
  t3.addtime(t1,t2);
  t3.puttime();
    return 0;
}