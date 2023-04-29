#include <iostream>
#include <unordered_set>
using namespace std;

int main() {
	unordered_set<int> s;
	s.insert(10);
	s.insert(5);
	s.insert(15);
	s.insert(20);
	for(int x : s){
	    cout << x << " ";
	}
	cout << endl;
	
	for (auto it = s.begin(); it != s.end(); it++) {
	    cout << (*it) << " ";
	}
	cout << endl;
	if(s.find(15) == s.end()){
	    cout << "Not found";
	}else{
	    cout << "Found " << *(s.find(15));
	}
	cout << endl;
	if(s.count(15)){
	    cout << "Found";
	}else{
	    cout << "Not found";
	}
	cout << endl;
	cout << s.size() << " ";
	s.erase(15);
	cout << s.size() << " ";
	auto it = s.find(10);
	s.erase(it);
	cout << s.size() << " ";
	s.erase(s.begin(), s.end());
// 	s.clear();
	cout << s.size() << " ";
	return 0;
}
