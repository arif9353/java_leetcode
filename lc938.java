import java.util.*;
class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
      }
  }
class Solution938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        if(root==null){
            return sum;
        }
        if(root.val>=low && root.val<=high){
            sum+=root.val;
        }
        if(root.val>low){
            sum += rangeSumBST(root.left,low,high);
        }
        if(root.val<high){
            sum += rangeSumBST(root.right,low,high);
        }
        return sum;
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));

        int low = 7;
        int high = 15;
        Solution938 ob = new Solution938();
        int result = ob.rangeSumBST(root, low, high);
        System.out.println(result);
    }
}