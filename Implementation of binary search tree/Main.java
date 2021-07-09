#include<iostream>
#include<cstdlib>
using namespace std;
struct node
{
  int data;
  struct node *left;
  struct node *right;
};
struct node *root='\0';
struct node * create(int data)
{
	struct node *newnode = (struct node*)malloc(sizeof(struct node));
	newnode->data=data;
	newnode->left=newnode->right=NULL;
	return newnode;
}
void insert(struct node *temp, struct node *t)
{
	if(temp->data>t->data && t->right!=NULL)
		insert(temp,t->right);
	if(temp->data>t->data && t->right==NULL)
		t->right=temp;
	if(temp->data<t->data && t->left!=NULL)
		insert(temp,t->left);
	if(temp->data<t->data && t->left==NULL)
		t->left=temp;	
}
void print(struct node *t)
{
	if(t==NULL)
		return;
	print(t->left);
	cout<<t->data<<" ";
	print(t->right);
}
int main()
{
  int n;
  cin>>n;
  while(n!=-1)
  {
    struct node *newnode = create(n);
    if(root==NULL)
      root=newnode;
    else
      insert(newnode,root);
    cin>>n;
  }
  cout<<"Tree values are:\n";
  print(root);
}