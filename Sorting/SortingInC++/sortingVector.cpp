#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main()
{
    vector<int> v = {10, 20, 5, 7};
    int n = 4;
    sort(v.begin(), v.end());

    for (int x : v)
    {
        cout << x << " ";
    }

    sort(v.begin(), v.end(), greater<int>());

    cout << endl;
    for (int x : v)
    {
        cout << x << " ";
    }
}