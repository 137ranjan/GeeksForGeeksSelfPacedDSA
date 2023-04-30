#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
	unordered_map<string, int> m;
	m["gfg"] = 20;
	m["ide"] = 30;
	m.insert({"courses",153});
	for (auto x : m) {
	    cout << x.first << " " << x.second << endl;
	}
	if(m.find("ide") != m.end()){
	    cout << "Found\n";
	}else{
	    cout << "Not Found\n";
	}
	for(auto it = m.begin(); it != m.end(); it++){
	    cout << (it->first) << " " << (it->second) << endl;
	}
	if(m.count("ide") > 0)
	    cout << "Found";
	else
	    cout << "Not Found";
	    
	cout << endl;
	cout << m.size() << endl;
	m.erase("ide");
	cout << m.size() << endl;
	m.erase(m.begin());
	cout << m.size() << endl;
	m.erase(m.begin(), m.end());
	cout << m.size() << endl;
	return 0;
}
