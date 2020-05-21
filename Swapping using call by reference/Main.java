#include<iostream>

 int main()
{
int a, b;
std::cin>>a >>b ;
std::cout<<"Before swapping a= "<<a <<" and b="<<b;
a=a+b;//a=30 (10+20)
b=a-b;//b=10 (30-20)
a=a-b;//a=20 (30-10)
std::cout<<"\nAfter swapping a= "<<a <<" and b="<<b;
return 0;
}
