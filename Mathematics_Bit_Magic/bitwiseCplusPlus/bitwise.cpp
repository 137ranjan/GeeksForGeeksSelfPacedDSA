#include <iostream>

using namespace std;

int main()
{
    int x, y;
    cout << "\nEnter x : ";
    cin >> x;
    cout << "\nEnter y : ";
    cin >> y;
    unsigned int z = x;

    cout << "\nBitwise AND of x and y : " << (x & y) << "\n";
    cout << "\nBitwise OR of x and y : " << (x | y) << "\n";
    cout << "\nBitwise XOR of x and y : " << (x ^ y) << "\n\n";
    cout << "\nLeft Shift operation on x (x << 1): " << (x << 1) << "\n\n";
    cout << "\nLeft Shift operation on x (x << 3): " << (x >> 1) << "\n\n";
    cout << "\nBitwise NOT operation on signed x (~x): " << (~x) << "\n\n";
    cout << "\nBitwise NOT operation on unsigned z (~z): " << (~z) << "\n\n";
}