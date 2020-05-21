#include<iostream>
#include<cstdlib>

int main(){
  int *p,NoTickets,m,f;
  std::cin>>NoTickets;
  p = (int *)malloc(2 *sizeof(int));
  for(int i = 0; i < NoTickets; i++)
  {
    std::cin>> *(p+i);
    if(*(p+i)%2 != 0)
      f++;
    else if(*(p+i)%2==0)
      m++;
  }
  std::cout<<f<<"\n"<<m;

  return 0;
}
