#include <iostream>
using namespace std;
int fact(int x);

int main()
{
   int num;
   std::cin>>num;
   std::cout<<"The factorial of "<<num <<" is "<<fact(num);
}
int fact(int x)
{
    int factorial = 1;
    if(x<0)
        std::cout<<"ERROR";
    
    else
    {
        for (int counter = x; counter >=2; counter--)
        {
          factorial = factorial*counter;
        }

    }
    return factorial;

}
