#include <iostream>

using namespace std;

int main()
{
    int r,c;
    std::cin>>r>>c;
    int matrix1[r][c],matrix2[r][c],sum[r][c];

    for(int i=0; i<r ;i++)
    {
        for(int j=0; j<c; j++)
        {
            std::cin>>matrix1[i][j];
        }
    }
    for(int i=0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            std::cin>>matrix2[i][j];
        }
    }
    for(int i=0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            sum[i][j]=matrix1[i][j]+matrix2[i][j];
        }
    }
    for(int i=0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            std::cout<<sum[i][j]<<" ";
            if(j == c-1)
                std::cout<<"\n";
        }
    }


}
