package com.demo.test;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class BinaryTree {
	static final List<Integer> preOrderList = new ArrayList();
	static final List<Integer> postOrderList = new ArrayList();
	static final List<Integer> inOrderList = new ArrayList();

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		preorder(root);
		System.out.println(preOrderList);
		postOrder(root);
		System.out.println(postOrderList);
		inOrder(root);
		System.out.println(inOrderList);

		
	}
	 

	public static void preorder(TreeNode root) {
		preOrderList.add(root.val);
//		System.out.println(list);
	    
		if (root.left != null) {
			preorder(root.left);
		}
		if (root.right != null) {
			preorder(root.right);
		}
	}

	public static void postOrder(TreeNode root) {
//		System.out.println(list);
		if (root.left != null) {
			postOrder(root.left);
		}
		if (root.right != null) {
			postOrder(root.right);
		}
		postOrderList.add(root.val);
	}
	public static void inOrder(TreeNode root) {
//		System.out.println(list);
		if (root.left != null) {
			inOrder(root.left);
		}
		inOrderList.add(root.val);
		
		if (root.right != null) {
			inOrder(root.right);
		}
	}
}