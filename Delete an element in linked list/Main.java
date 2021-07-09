#include<iostream>
using namespace std;
class node
{
  public:
   int data;
   node *next;
};
node *head = NULL;
void create(int d)
{
  node *newnode;
  newnode = new node();
  newnode -> data = d;
  newnode -> next = NULL;
  if(head == NULL)
    head = newnode;
  else
  {
    node * temp;
    temp = head;
    while(temp -> next != NULL)
      temp = temp -> next;
    temp -> next = newnode;
  }
}
void display()
{
  node *temp;
  temp = head;
  if(temp == NULL)
    cout<<"No value"<<endl;
  else
  {
    while(temp != NULL)
    {
      cout<<temp->data<<endl;
      temp = temp ->next;
    }
  }
}
void del ()
{
  node *temp = head;
  head = head -> next;
  free(temp);
}
int main()
{
 int d;
  do{
    cin>>d;
    if(d<0)
      break;
    create(d);
  
  }while(d>0);
  //display();//before deleting
  del();
   display();//after deleting
  return 0;
}