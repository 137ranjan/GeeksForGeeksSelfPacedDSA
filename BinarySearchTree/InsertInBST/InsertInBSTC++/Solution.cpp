#include <iostream>

using namespace std;

struct Node
{
    int key;
    Node *left;
    Node *right;

    Node(int data)
    {
        key = data;
        left = NULL;
        right = NULL;
    }
};

Node *insertRecursive(Node *root, int data)
{
    if (root == NULL)
        return new Node(data);
    else if (root->key < data)
        root->right = insertRecursive(root->right, data);
    else if (root->key > data)
        root->left = insertRecursive(root->left, data);
    return root;
}

Node *insertIterative(Node *root, int data)
{
    Node *temp = new Node(data);
    Node *parent = NULL;
    Node *curr = root;

    while (curr != NULL)
    {
        parent = curr;
        if (curr->key > data)
            curr = curr->left;
        else if (curr->key < data)
            curr = curr->right;
        else
            return root;
    }

    if (parent == NULL)
        return temp;
    if (parent->key > data)
        parent->left = temp;
    else
        parent->right = temp;

    return root;
}

int main()
{
    Node *root = NULL;
    root = insertRecursive(root, 15);
    root = insertRecursive(root, 5);
    root = insertRecursive(root, 3);
    root = insertRecursive(root, 20);
    root = insertRecursive(root, 18);
    root = insertRecursive(root, 16);
    cout << root->key << endl;
    cout << root->left->key << endl;
    cout << root->left->left->key << endl;
    cout << root->right->key << endl;

    Node *root2 = NULL;
    root2 = insertIterative(root2, 15);
    root2 = insertIterative(root2, 5);
    root2 = insertIterative(root2, 3);
    root2 = insertIterative(root2, 20);
    root2 = insertIterative(root2, 18);
    root2 = insertIterative(root2, 16);
    cout << root2->key << endl;
    cout << root2->left->key << endl;
    cout << root2->left->left->key << endl;
    cout << root2->right->key << endl;
}
