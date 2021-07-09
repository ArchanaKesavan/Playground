#include<iostream>
#include<cstdlib>
using namespace std;
class Node
{
    public:
        int data;
        Node *next;
};
void insert(Node **headadd,int data)
{
    Node *temp, *newnode;
    temp = *headadd;
    newnode = new Node();
    newnode->data = data;
    newnode->next = NULL;
    if(*headadd == NULL)
        *headadd = newnode;
    else
    {
        *headadd = newnode;
        newnode->next = temp;
    }
}
int main()
{
    Node *head = NULL;
    int data,count=0;
    do
    {
        cin>>data;
        if(data>0)
        {
            count++;
            insert(&head,data);
        }
    }while(data>0);
    cout<<sizeof(head)*count;
    return 0;
}