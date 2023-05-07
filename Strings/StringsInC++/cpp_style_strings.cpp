#include <iostream>
#include <string>

using namespace std;

int main() {
	// C++ - style strings
	string str = "geeksforgeeks";
	cout << str.length() << endl;
	str = str + "xyz";
	cout << str << endl;
	cout << str.substr(1,3) << endl;
	cout << str.find("eek") << endl;
	
	string s1 = "abc";
	string s2 = "bcd";
	if(s1 == s2){
	    cout << "Same" << endl;
	}
	else if(s1 < s2){
	    cout << "Greater" << endl;
	}else {
	    cout << "Smaller" << endl;
	}
	
	string str2;
	cout << "Enter your name" << endl;
	getline(cin, str2);
	cout << "Your name is " << str2 << endl;
	
	for(int i=0; i<str.length(); i++){
	    cout << str[i];
	}
	cout << endl;
	for(char x : str){
	    cout<< x;
	}
	return 0;
}
