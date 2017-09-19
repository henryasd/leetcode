
//  Definition for a binary tree node.


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;
import java.util.List;

public class UniqueBST_95 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

        @Override
        public String toString() {
            return left.toString() + " " +
                    val + " " +
                    right.toString() + " ";
        }
    }

    public static void main(String[] args) {
        new UniqueBST_95().begin();
    }

    private void begin() {
        System.out.println(generateTrees(3).toString());
    }

    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[] dp = new List[n  + 1];
        dp[0] = new LinkedList<TreeNode>();
        if(n == 0) return dp[0];
        dp[0].add(null);
        for(int i = 1; i <= n; i++){
            dp[i] = new LinkedList<TreeNode>();
            for(int j = 1; j <= i; j++){
                for(TreeNode nodeL: dp[j - 1]){
                    for(TreeNode nodeR: dp[i - j]){
                        TreeNode nodej = new TreeNode(j);
                        nodej.left = nodeL;
                        nodej.right = clone(nodeR, j);
                        dp[i].add(nodej);
                    }
                }

            }
        }
        return dp[n];
    }
    public TreeNode clone(TreeNode root, int offset){
        if(root == null) return null;
        TreeNode newNode = new TreeNode(root.val + offset);
        newNode.left = clone(root.left, offset);
        newNode.right = clone(root.right, offset);
        return newNode;
    }
}
