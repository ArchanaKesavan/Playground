#include<stdio.h>
int power(int b , int p)
{
  if(p == 0)
    return 1;
  if(p == 1)
    return b;
  
  return b*power(b,p-1);//5*p(5,2)-->5*p(5,1)
}
int main()
{
 int b,p;
  scanf("%d%d",&b,&p);//5 3
  int res = power(b,p);
  printf("%d",res);
  return 0;
}