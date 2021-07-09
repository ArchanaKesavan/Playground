#include<iostream>
#include<cstdlib>
using namespace std;
class Node
{
    public:
        int data;
        Node *next;
};
void append(Node **headadd,int data)
{
    Node *temp,*newnode;
    temp = *headadd;
    newnode = new Node();
    newnode->data = data;
    newnode->next = NULL;
    if(*headadd == NULL)
        *headadd = newnode;
    else
    {
        while(temp->next != NULL)
            temp = temp->next;
        temp->next = newnode;
    }
}
void display(Node *head)
{
    while(head != NULL)
    {
        cout<<head->data<<endl;
        head = head->next;
    }
}
void deletion(Node **headadd)
{
    Node *temp = *headadd;
    if(temp->next != NULL)
    {
        Node *temp1 = temp->next;
        *headadd = temp1;
        temp->next = NULL;
        free(temp);
    }
    else
    {
        free(temp);
        *headadd = NULL;
        cout<<"No value to delete";
    }
}
int main()
{
    Node *head = NULL;
    int data,pos,val,count=0;
    do
    {
        cin>>data;
        if(data>0)
        {
            append(&head,data);
            count++;
        }
    }while(data > 0);
    cout<<"Before deletion:\n";
    display(head);
    for(int i=1;i<=count;i++)
    {
        cout<<"After "<<i<<" deletion:\n";
        deletion(&head);
        display(head);
    }
    return 0;
}