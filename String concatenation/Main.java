#include <iostream>
#include<string.h>
using namespace std;

int main() 
{
  char str1[20],str2[20];
  cin>>str1>>str2;
  strcat(str1,str2);
  cout<<"The concatenated string is "<< str1;
    return 0;
}