#include <iostream>

using namespace std;

void print(int mat[3][2])
{
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cout << mat[i][j] << " ";
        }
        cout << endl;
    }
}

int main()
{
    int mat[3][2] = {{10, 20},
                     {30, 40},
                     {50, 60}};
    print(mat);

    return 0;
}