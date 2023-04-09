#include <iostream>
#include <algorithm>

using namespace std;

struct Point
{
    int x;
    int y;
};

bool myCmp(Point p1, Point p2)
{
    return p1.x < p2.x;
}

int main()
{
    Point arr[] = {{3, 10}, {2, 8}, {5, 4}};
    int n = sizeof(arr) / sizeof(arr[0]);
    for (Point p : arr)
    {
        cout << "{" << p.x << ", " << p.y << "}, ";
    }
    sort(arr, arr + n, myCmp);
    cout << endl;
    for (Point p : arr)
    {
        cout << "{" << p.x << ", " << p.y << "}, ";
    }
}