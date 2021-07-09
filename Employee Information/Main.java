#include<iostream>
#include<string.h>
using namespace std;
class inher1
{
  public:
  string name;
  int emp_id;
  char gender;
 
};
class inher2
{
  public:
  char dept_name[40];
  char ass_work[40];
  int time_hrs;
 
};
class print:public inher1,public inher2
{
public:
	void Einfo(string n,int ei,char g)
    {
    cout<<"Basic Information...:"<<endl;
	cout<<"Name: "<<n<<endl;
	cout<<"Employee ID: "<<ei<<endl;
	cout<<"Gender: "<<g<<endl;
    }
    void Dinfo(string d,string a,int t)
    {
    cout<<endl<<"Department Information...:"<<endl;
	cout<<"Department Name: "<<d<<endl;
	cout<<"Assigned Work: "<<a<<endl;
	cout<<"Time to complete work: "<<t<<endl;
    }
};
int main()
{
  print p;
  cout<<"Enter employee's basic info:"<<endl;
  cout<<"Enter Name: ";
  cin>>p.name;
  cout<<"Enter Emp. Id: ";
  cin>>p.emp_id;
  cout<<"Enter Gender: ";
  cin>>p.gender;
  cout<<"Enter employee's department info:"<<endl;
  cout<<"Enter Department Name: ";
  cin.ignore(1);
  cin.getline(p.dept_name,40);
  cout<<"Enter assigned work: ";
  cin.getline(p.ass_work,40);
  cout<<"Enter time in hours to complete work: ";
  cin>>p.time_hrs;
  cout<<"Employee's Information is:"<<endl;
  p.Einfo(p.name,p.emp_id,p.gender);
  p.Dinfo(p.dept_name,p.ass_work,p.time_hrs);
  return 0;
}