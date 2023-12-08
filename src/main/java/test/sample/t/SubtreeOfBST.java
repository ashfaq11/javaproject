package test.sample.t;
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class SubtreeOfBST {

    public static void main(String[] args) {
        // Example trees
        TreeNode largerTree = new TreeNode(5);
        largerTree.left = new TreeNode(3);
        largerTree.right = new TreeNode(8);
        largerTree.left.left = new TreeNode(2);
        largerTree.left.right = new TreeNode(4);
        largerTree.right.left = new TreeNode(7);
        largerTree.right.right = new TreeNode(9);

        TreeNode smallerTree = new TreeNode(3);
        smallerTree.left = new TreeNode(2);
        smallerTree.right = new TreeNode(4);

        // Check if smallerTree is a subtree of largerTree
        if (isSubtree(largerTree, smallerTree)) {
            System.out.println("The smaller tree is a subtree of the larger tree.");
        } else {
            System.out.println("The smaller tree is not a subtree of the larger tree.");
        }
    }

	private static boolean isSubtree(TreeNode largerTree, TreeNode smallerTree) {
		if(largerTree == null)
			return false;
		
		if(isIdentical(largerTree,smallerTree)) {
			return true;
		}
		
		
		return isSubtree(largerTree.left, smallerTree) || isSubtree(largerTree.right, smallerTree);
	}

	private static boolean isIdentical(TreeNode largerTree, TreeNode smallerTree) {
		// TODO Auto-generated method stub

		if(largerTree == null && smallerTree == null)
			return true;
		
		if(largerTree == null || smallerTree == null)
			return false;
		
		
		
		return largerTree.val== smallerTree.val && isIdentical(largerTree.left, smallerTree.left) && isIdentical(largerTree.right, smallerTree.right) ;
	}
}