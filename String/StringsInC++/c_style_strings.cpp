#include <iostream>
#include <cstring>

using namespace std;

int main() {
	// C - style strings
	char str[] = "gfg";
	cout << str << endl;
	cout << "sizeof(str) = " << sizeof(str) << endl;
	
	char str2[] = {'g','f', 'g', '\0'};
	cout << str2 << endl;
	cout << "sizeof(str2) = " << sizeof(str2) << endl;
	
	cout << "strlen(str) = " << strlen(str) << endl;
	cout << "strlen(str2) = " << strlen(str2) << endl;
	
	char s1[] = "abc";
	char s2[] = "bcd";
	
	int res = strcmp(s1, s2);
	if(res > 0){
	    cout << "Greater" << endl;
	} else if(res == 0){
	    cout << "Same" << endl;
	} else{
	    cout << "Smaller" << endl;
	}
	
	char str3[5];
	strcpy(str3,"gfg");
	cout << str3;
	
	return 0;
}
