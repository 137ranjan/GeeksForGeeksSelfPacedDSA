#include <iostream>

using namespace std;

void linerSearch(int arr[], int n, int x)
{
    int pos = 0;
    bool flag = false;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == x)
        {
            flag = true;
            pos = i + 1;
            break;
        }
    }

    if (flag)
    {
        cout << "\n"
             << "X found at position :" << pos << "\n"
             << endl;
        return;
    }
    else
    {
        cout << "\n"
             << "Element not found.";
    }
}

int main()
{
    int n;
    cout << "Enter the number of digits in array :";
    cin >> n;
    int arr[n];
    cout << "Enter the array elements separated by space :"
         << "\n";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    cout << "Enter the item X to be searched: ";
    int x;
    cin >> x;
    cout << "Input Array: ";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << ", ";
    }
    cout << "\n"
         << endl;
    linerSearch(arr, n, x);
}