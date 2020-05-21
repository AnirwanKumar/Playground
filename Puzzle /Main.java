#include <iostream>

using namespace std;

int main()
{
    int r,c;
    std::cin>>r>>c;
    int puzzle[10][10],transpose[10][10];

    for(int i=0; i<r ;i++)
    {
        for(int j=0; j<c; j++)
        {
            std::cin>>puzzle[i][j];
        }
    }
    for(int i=0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            transpose[j][i] = puzzle[i][j];
        }
    }
    for(int i=0; i<c; i++)
    {
        for(int j=0; j<r; j++)
        {
          std::cout<<transpose[i][j]<<" ";
            if(j == r-1)
        std::cout<<"\n";
        }

    }
}
