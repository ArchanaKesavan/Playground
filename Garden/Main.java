#include <iostream>
using namespace std;
class circle
{
  public:
 int r;
  public:
  float area()
  {
    return 3.14*r*r;
  }
};
int main() 
{
   circle c;
  cout<<"Enter the value of Radius :"<<endl;
  cin>>c.r;
  cout<<"Area of Circle : "<<c.area();
    return 0;
}