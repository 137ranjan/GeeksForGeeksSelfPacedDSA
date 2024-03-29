#include <iostream>
using namespace std;

struct Node{
    int key;
    Node *left;
    Node *right;
    
    Node(int k){
        key = k;
        left = right = NULL;
    }
};

Node *floorInBST(Node *root, int x){
    Node *res = NULL;
    while(root != NULL){
        if(root->key == x){
            return root;
        }
        else if(root->key > x){
            root = root->left;
        }else{
            res = root;
            root = root->right;
        }
    }
    
    return res;
}

int main() {
	Node *root = new Node(15);
    root->left = new Node(5);
    root->right = new Node(20);
    root->left->left = new Node(3);
    root->right->left = new Node(18);
    root->right->left = new Node(16);
    root->right->right = new Node(80);
    Node *res = floorInBST(root, 17);
    cout << res->key;
	return 0;
}
