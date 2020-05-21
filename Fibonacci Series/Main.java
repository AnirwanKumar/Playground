#include<iostream>
using namespace std;
int fbnc(int);
int main()
{
   int num;
   std::cin>>num;
   std::cout<<"The term "<<num<<" in the fibonacci series is "<<fbnc(num);
}
int fbnc(int x)
{
    int next,first=0,second=1;
    for(int i=0; i<x-1; i++)
    {

        next=first+second;
        first = second;
        second = next;
    }
    return first;
}
