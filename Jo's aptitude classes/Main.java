#include <iostream>
int greatest_num(int a, int b, int c)
{
if(a>=b && a>=c)
{
return a;
}

else if(b>=a && b>=c)
{
return b;
}

else if(c>=a && c>=b)
{
return c;
}
}

int main()
{

int m,n,o,p;
std::cin>>m >>n >> o >>p;

int result;

for(result=greatest_num(m,n,o); result>=1; result--){
if(m%result==0 && n%result==0 && o%result==0){
break;
}
}
if ( result == p)
    std::cout<<"Answer is correct.";
else
    std::cout<<"Answer is wrong.";
return 0;

}
