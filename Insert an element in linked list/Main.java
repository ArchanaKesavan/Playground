#include<iostream>
#include<stdlib.h>
using namespace std;
struct node
{
    //public:
    int data;
   struct node *next;
};

struct node *root = NULL;

void append(int d)
{
    struct node *newnode;
    newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = d;
    newnode->next = NULL;
    if(root == NULL)
        root = newnode;
    else
    {
        struct node *temp;
        temp = root;
        while(temp->next != NULL)
        {
            temp= temp -> next;
        }
        temp -> next = newnode;
    }
}


void display()
{
    struct node *temp;
    temp = root;
    
        while(temp != NULL)
        {
            cout<<temp->data<<endl;
        	temp = temp -> next;
        }
    
}


int main()
{
    int d;
    do{
        cin>>d;
        if(d>0)
            append(d);     
    }while(d>0);
display();
return 0;
}
