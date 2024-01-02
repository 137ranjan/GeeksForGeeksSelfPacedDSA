import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		ArrayList<Integer> arr = new ArrayList<>();

		serialize(root, arr);
		arr.forEach(i -> System.out.print(i + " "));
		System.out.println("");

		Node root2 = deSerialize(arr);

		ArrayList<Integer> arr2 = new ArrayList<>();
		serialize(root2, arr2);
		arr2.forEach(i -> System.out.print(i + " "));
	}

	private static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	private static final int EMPTY = -1;

	private static void serialize(Node root, ArrayList<Integer> arr) {
		if (root == null) {
			arr.add(EMPTY);
			return;
		}
		arr.add(root.data);
		serialize(root.left, arr);
		serialize(root.right, arr);
	}

	private static int index = 0;

	private static Node deSerialize(ArrayList<Integer> arr) {
		if (index == arr.size()) {
			return null;
		}
		int val = arr.get(index);
		index++;
		if (val == EMPTY) {
			return null;
		}
		Node root = new Node(val);
		root.left = deSerialize(arr);
		root.right = deSerialize(arr);
		return root;
	}
}