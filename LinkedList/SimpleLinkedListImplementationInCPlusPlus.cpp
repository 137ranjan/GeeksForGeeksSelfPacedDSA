#include <iostream>
using namespace std;

struct Node{
    int data;
    Node* next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
};

int main() {
	Node* head = new Node(10);
	head->next = new Node(20);
	head->next->next = new Node(30);
	Node* temp = head;
	while(temp != NULL){
	    cout<<temp->data<<", ";
	    temp = temp->next;
	}
	return 0;
}
