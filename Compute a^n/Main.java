#include<iostream>
using namespace std;
int power(int,int);
int main()
{
  int x,y;
  std::cout<<"Enter the value of a \n";
    std::cin>>x;
  std::cout<<"Enter the value of n \n";
    std::cin>>y;
  std::cout<<"The value of "<<x<<" power "<<y<<" is "<<power(x,y);
  
}
int power(int base, int a) 
{
    if (a != 0)
        return (base * power(base, a - 1));
    else
        return 1;
}