#include<iostream>
using namespace std;
struct node
{
   
    int data;
    struct node *next;
};

void append(int d);
void display();
void reverse();
struct node *head = NULL;
int main()
{
    int d;
    do{
       cin>>d;
        if(d>0)
        {
            append(d);
        }
        else
        {
        	break;
        }
    }while(d>0);
  cout<<"Before Reversing the list:"<<endl;
  display();
  reverse();
  cout<<"After Reversing the list:"<<endl;
  display();
return 0;
}
void append(int d)
{
    struct node *newnode;
    newnode = (struct node*)malloc(sizeof(struct node)); 
    newnode->data = d;
    newnode->next = NULL;
    if(head == NULL)
    {
        head = newnode;
    }
    else
    {
        struct node*temp;
        temp = head;
        while(temp->next != NULL)
        {
            temp=temp->next;
        }
        temp->next = newnode;
    }
}
void display()
{
  struct node *temp;
    temp = head;
    if(temp == NULL)
    {
        cout<<"List is Empty";
    }
    else
    {
        while(temp!= NULL)
        {
           cout<<temp->data<<endl;
        	temp=temp->next;
        }
    }
}

void reverse()
{
        struct node* current = head; 
        struct node *prev = NULL;
        struct node *temp = NULL; 
        while (current != NULL) 
        { 
            temp = current->next; 
            current->next = prev; 
            prev = current; 
            current = temp; 
        } 
        head = prev; 
}


