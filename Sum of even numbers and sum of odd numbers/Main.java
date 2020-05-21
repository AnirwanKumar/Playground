#include<iostream>
using namespace std;
int main()
{
  int n,Esum=0,Osum=0;
  std::cin>>n;
  int Set[n];
  for(int i = 0;i<n;i++)
  {
    std::cin>>Set[i];
  }
  for(int i=0;i<n;i++)
  {
      if(Set[i]%2 == 0)
        Esum = Esum+Set[i];
      else
        Osum = Osum+Set[i];
  }
  std::cout<<"The sum of the even numbers in the array is " <<Esum;
  std::cout<<"\n" <<"The sum of the odd numbers in the array is "<<Osum;
}