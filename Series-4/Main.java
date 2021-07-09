#include<stdio.h>
int main()
{
 int n,i,n1=0,x=3;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d ",n1);
    n1=n1+x;
    x=x+2;
  }
  
}