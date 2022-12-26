#include <iostream>

using namespace std;

void func1()
{
    cout << " Hello World";
    func1();
}

int main()
{
    func1();
    return 0;
}