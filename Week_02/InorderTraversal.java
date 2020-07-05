package algorithm;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal { /*     * Definition for a binary tree node.*/
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     *
     * @param root
     * @return
     */
    public List<Integer> solution(TreeNode root) {
        List<Integer> rslt = new ArrayList<>();
        if (root == null) return rslt;
        traversal(root,rslt);
        return rslt;
    }

    public void traversal(TreeNode root,List<Integer> rslt) {
        if (root.left != null) {
            traversal(root.left,rslt);
        }
        rslt.add(root.val);
        if (root.right != null) {
            traversal(root.right,rslt);
        }
    }

}
