#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int student[n];
  for(int i=0; i<n; i++)
  {
      std::cin>>student[i];
  }

  int large = student[0];
  for(int i=0; i<n; i++)
  {
      if (student[i] > large)
      large = student[i];

  }
  std::cout<<large;

}