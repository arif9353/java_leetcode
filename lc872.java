import java.util.*;

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

class Solution872 {
    public void valueOfLeafNode(TreeNode root, List<Integer> leafValues) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafValues.add(root.val);
        }
        valueOfLeafNode(root.left, leafValues);
        valueOfLeafNode(root.right, leafValues);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafValues1 = new ArrayList<>();
        List<Integer> leafValues2 = new ArrayList<>();

        valueOfLeafNode(root1, leafValues1);
        valueOfLeafNode(root2, leafValues2);

        return leafValues1.equals(leafValues2);
    }

    public static void main(String args[]) {
        Solution872 ob = new Solution872();
        TreeNode root1 = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));
        TreeNode root2 = new TreeNode(99,
                new TreeNode(11, new TreeNode(3), new TreeNode(7)),
                new TreeNode(16, null, new TreeNode(18)));
        boolean result = ob.leafSimilar(root1,root2);
        System.out.println(result);
    }
}
