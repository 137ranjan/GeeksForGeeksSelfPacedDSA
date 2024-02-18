#include <iostream>

using namespace std;

struct Node
{
    int key;
    Node *left;
    Node *right;

    Node(int x)
    {
        key = x;
        left = right = NULL;
    }
};
Node *getSuccessor(Node *curr)
{
    curr = curr->right;
    while (curr != NULL && curr->left != NULL)
        curr = curr->left;
    return curr;
}
Node *deleteInBST(Node *root, int x)
{
    if (root == NULL)
        return root;
    if (root->key > x)
        root->left = deleteInBST(root->left, x);
    else if (root->key < x)
        root->right = deleteInBST(root->right, x);
    else
    {
        if (root->left == NULL)
        {
            Node *temp = root->right;
            delete root;
            return temp;
        }
        else if (root->right == NULL)
        {
            Node *temp = root->left;
            delete root;
            return temp;
        }
        else
        {
            Node *succ = getSuccessor(root);
            root->key = succ->key;
            root->right = deleteInBST(root->right, succ->key);
        }
    }
    return root;
}

int main()
{
    Node *root = new Node(15);
    root->left = new Node(5);
    root->right = new Node(20);
    root->left->left = new Node(3);
    root->right->left = new Node(18);
    root->right->left = new Node(16);
    root->right->right = new Node(80);

    root = deleteInBST(root, 15);
    cout << root->key;
}
