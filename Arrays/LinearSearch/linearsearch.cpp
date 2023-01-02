#include <iostream>
using namespace std;

int linearSearch(int a[], int n, int x){
        int pos = -1;
        for (int i = 0; i <n ; i++) {
            if(a[i] == x){
                return i+1;
            }
        }
        
        return -1;
}

int main() {
	int a[] = {1,3,4,2,5,6,7,8,9,0};
	int n = 10;
	cout<<"\na[] = ";
	for (int i = 0; i < n; i++) {
	    cout<<a[i]<<" ";
	}
	int x = 0;
	cout<<endl <<linearSearch(a,n,x);
	return 0;
}
