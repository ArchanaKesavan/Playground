#include<iostream>
using namespace std;
struct marksheet
{
  int rn,s1,s2,s3,s4,s5,grade;
  float avg;
};
int main()
{
  int n;
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  cin>>n;
  struct marksheet s[n];
  for(int i=0;i<n;i++)
    cin>> s[i].rn >> s[i].s1 >> s[i].s2 >> s[i].s3 >> s[i].s4 >> s[i].s5;
  for(int i=0;i<n;i++)
  {
    s[i].avg = (s[i].s1+s[i].s2+s[i].s3+s[i].s4+s[i].s5)/5;
  }
  for(int i=0;i<n;i++)
  {
      if(s[i].avg >= 70)
        {
            s[i].grade=1;
        }
     else if(s[i].avg >= 50 && s[i].avg<70)
        {
            s[i].grade=2;
        }
      else
        {
            s[i].grade=3;
        }
  }
  cout<<"rn s1 s2 s3 s4 s5 avg grade"<<endl;
  for(int i=0;i<n;i++)
  {
    cout<<s[i].rn<<" "<<s[i].s1
      <<" "<< s[i].s2 <<" "<< s[i].s3 <<" "<< s[i].s4 <<" "<< s[i].s5 <<" "<< s[i].avg <<" "<< s[i].grade<<endl;
  }
  return 0;
}