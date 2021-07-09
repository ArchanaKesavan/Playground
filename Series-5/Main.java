#include<stdio.h>
int main()
{
  int n,i,n1=2;
  scanf("%d",&n);
  printf("%d ",n1);
  for(i=0;i<n-1;i++)
  {
    n1=(n1*2)-i;
    printf("%d ",n1);
  }
}