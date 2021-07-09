#include <stdio.h>
#include <stdlib.h> 
#define MAX 3
int top,a[MAX];
void display(int a[]);
void PUSH(int a[],int);
void POP (int a[]);
int main()
{
    int choice,ele,n;
    top=-1;
 printf("Enter the maximum size of the stack\n");
  scanf("%d",&n);
    while(1)
    {
      printf("Choice 1 : Push\nChoice 2 : Pop\nChoice 3 : Display\nAny other choice : Exit\nEnter your choice\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                printf("Enter the element to be pushed\n");
                scanf("%d",&ele);
                push(a,ele);
            break;
            case 2:
                pop(a);
            break;
            case 3:
                display(a);
            break;
            default:
                exit(0);
        }
    }
}
void display(int a[])
{
    int i=0;
  printf("The contents of the stack are ");
    if(top==-1)
    {
        printf("{}\n");
        return;
    }//printf("%d",stack[TOP]);
  else{
    for(i=0;i <= top;i++)
    {
        printf("%d ",a[i]);
    }
    printf("\n");
  }
}
void push(int a[],int ele)
{
    if(top==MAX-1)
    {
        printf("Stack is full\n");
        return;
    }
    top++;
    a[top]=ele;
}
void pop(int a[])
{
    if(top==-1)
    {
        printf("Stack is empty\n");
        //return;
    }
  else
  {
    
    printf("The popped element is %d\n",a[top]);
    top--;
  }
}
