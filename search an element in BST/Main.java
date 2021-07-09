#include<iostream>
#include<stdlib.h>
using namespace std;
class node
{
  	public:
    int data;
    node* left;
    node *right;
};
node *root=NULL;
void insert(int a){
    node *newnode;
    node *temp;
    temp = root;
    newnode = new node;
    newnode->data = a;
    newnode->left = NULL;
    newnode->right = NULL;
    if(temp == NULL)
    {
     root = newnode;
    }
    else 
    {
        while(1)
        {
          while(temp->data > newnode->data && temp->left!=NULL)
            temp = temp->left;
            if(temp->data > newnode->data && temp->left== NULL)
            {
            temp->left=newnode;
            break;
            }
            while(temp->data < newnode->data && temp->right!= NULL)
            temp = temp->right;
            if(temp->data < newnode->data && temp->right == NULL)
            {
            temp->right = newnode;
            break;
            }
        }
    }  
}
int display(node *root,int d)
{
    node *temp = root;
    if(temp == NULL)
    return 0;
    if(temp->data == d)
    return 1;
    if(temp->data > d)
    display(temp->left,d);
    else
    display(temp->right,d);
}
int main()
{
 int a,d;
    do{      
        cin>>a;
      if(a<0)
        break;
        insert(a);
    }while(1);
  	cout<<"Enter the element to be searched:"<<endl;
  	cin>>d;
  	cout<<d;
   	int b = display(root,d);
  	if(b)
    cout<<" is present in the BST";
    else
    cout<<" is not present in the BST";
    return 0;
}