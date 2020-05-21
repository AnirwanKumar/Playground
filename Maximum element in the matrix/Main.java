#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,max=0;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
   {
     for(j=0;j<c;j++)
       {
         std::cin>>a[i][j];
       }
   }
  max=a[0][0];
  for(i=0;i<r;i++)
   {
     for(j=0;j<c;j++)
       {
         if(max<=a[i][j])
             max=a[i][j];
       }
   }
  std::cout<<"The maximum element is "<<max<<"\n";
}