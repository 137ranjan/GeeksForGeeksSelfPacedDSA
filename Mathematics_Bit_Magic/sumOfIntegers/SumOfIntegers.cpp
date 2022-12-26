#include <iostream>
#include <chrono>

using namespace std;
using namespace chrono;

int func1(int n)
{
    return (n * (n + 1)) / 2;
}

int func2(int n)
{
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        sum += i;
    }

    return sum;
}

int func3(int n)
{
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        for (int j = i; j <= n; j++)
        {
            sum++;
        }
    }

    return sum;
}
int main()
{
    int func1(int);
    int func2(int);
    int func3(int);

    auto start = high_resolution_clock::now();
    cout << func1(9000) << endl;
    auto stop = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(stop - start);
    cout << "Time taken by func1() : "<<duration.count() << endl;

    start = high_resolution_clock::now();
    cout << func2(9000) << endl;
    stop = high_resolution_clock::now();
    duration = duration_cast<microseconds>(stop - start);
    cout << "Time taken by func2() : "<<duration.count() << endl;

    start = high_resolution_clock::now();
    cout << func3(9000) << endl;
    stop = high_resolution_clock::now();
    duration = duration_cast<microseconds>(stop - start);
    cout << "Time taken by func3() : "<<duration.count() << endl;

    return 0;
}
