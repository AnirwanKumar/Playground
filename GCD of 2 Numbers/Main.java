#include<iostream>
int hcf(int,int);
int main()
{
  int num1,num2;
  std::cin>>num1>>num2;
  std::cout<<"G.C.D of "<<num1<<" and "<<num2 <<" = "<<hcf(num1,num2);
}
int hcf(int n1, int n2) 
{
    if (n2 != 0)
        return hcf(n2, n1 % n2);
    else
        return n1;
}