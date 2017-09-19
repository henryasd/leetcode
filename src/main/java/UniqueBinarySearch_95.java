import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/16.
 */
public class UniqueBinarySearch_95 {

//     / Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    public List<TreeNode> generateTrees(int n) {
        LinkedList<TreeNode>[] lists = new LinkedList[n];
        if(n == 0)return lists[0];
        lists[0].add(new TreeNode(1));
        for(int i = 1; i < n; i++){

            for(TreeNode node : lists[i - 1]){
                TreeNode ni = new TreeNode(i);
                ni.left = node;
                lists[i].add(ni);
            }
            for(TreeNode node : lists[i - 1]){
                TreeNode ni = new TreeNode(i);
                addNode(node, ni);
                lists[i].add(node);
            }

        }
        return lists[n - 1];
    }
    public void addNode(TreeNode root, TreeNode node){
        if(node.val > root.val){
            if(root.right == null){
                root.right = node;
            }
            else addNode(root.right, node);
        }
        else{
            if(root.left == null){
                root.left = node;
            }else
                addNode(root.left,node);
        }
    }
}
