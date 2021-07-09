#include<iostream>
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
void insert(Node **headadd,int pos,int val)
{
    Node *temp,*newnode,*temp1;
    temp = *headadd;
    newnode = new Node();
    newnode->data = val;
    newnode->next = NULL;
    int in = 1;
    if(pos == 1)
    {
        *headadd = newnode;
        newnode->next = temp;
    }
    else
    {
        while(pos != in)
        {
            if(pos-1 == in)
            {
                temp1 = temp->next;
                temp->next = newnode;
                newnode->next = temp1;
            }
            temp = temp->next;
            in++;
        }
    }
}
int main()
{
    Node *head = NULL;
    int data,pos,val;
    do
    {
        cin>>data;
        if(data>0)
            append(&head,data);
    }while(data > 0);
    cout<<"Before inserting the value:\n";
    display(head);
    cout<<"Enter the position and value to be inserted:\n";
    cin>>pos>>val;
    insert(&head,pos,val);
    cout<<"After inserting the value:\n";
    display(head);
    return 0;
}