#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int arr[] = {10, 20, 5, 7};
    int n = 4;
    sort(arr, arr + n);

    for (int x : arr)
    {
        cout << x << " ";
    }

    sort(arr, arr + n, greater<int>());

    cout << endl;
    for (int x : arr)
    {
        cout << x << " ";
    }
}