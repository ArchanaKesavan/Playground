#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[20],str2[20];
  cin>>str;
  strcpy(str2,str);
  cout<<"The copied string is "<<str2;
}