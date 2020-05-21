#include<iostream>
#include<cmath>
int chekBacteria(int m,int n,int req)
{
  int z;
  z= pow(m,n);
  if(z >= req)
    return 1;

}

int main()
{
  int a,b,c;
  std::cin>>a >>b >>c;
  if (chekBacteria(a,b,c) == 1)
  {
    std::cout<<"Doctor, you can proceed with your experiment.";

  }
  else
  {
    std::cout<<"Sorry Doctor! You need more bacteria.";
  }

}
