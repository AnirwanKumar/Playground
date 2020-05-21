#include<iostream>
int main()
{
  int n,m,flag;
  std::cin>>n;
  int passed[n];
  for(int i=0; i<n; i++)
  {
      std::cin>>passed[i];
  }
std::cin>>m;
  for(int i=0; i<n; i++)
  {
      if (passed[i] == m)
        flag = 1;
  }

      if (flag==1)
     std::cout<<"She passed her exam";
      else
      std::cout<<"She failed";


}
