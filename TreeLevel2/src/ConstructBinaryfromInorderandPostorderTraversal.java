import java.util.*;
import java.io.*;/*
public class ConstructBinaryfromInorderandPostorderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    /*
        public TreeNode buildTree(int[] inorder, int[] postorder) {

            HashMap<Integer , Integer> map = new HashMap<>();
            for(int i = 0 ; i < inorder.length ;i++){
                int val = inorder[i];
                map.put(val ,i);
            }
            TreeNode root = construct(0  , postorder.length -1 , 0 , inorder.length -1 ,postorder , map);
            return root;
        }
        public TreeNode construct(int post_lo , int post_hi , int in_lo , int in_hi , int[] post , HashMap<Integer, Integer> map){
            //base case
            if(post_lo > post_hi || in_lo > in_hi){
                return null;
            }

            // jo humaara last ka index hai wahi humaara node hai base case yahi hoga

            TreeNode node = new TreeNode();

            node.val = post[post_hi];

            int index = map.get(post[post_hi]);
            int rhs = in_hi - index;

            node.left =construct(post_lo ,post_hi - rhs -1 , in_lo , index -1 , post , map);
            node.right =construct(post_hi - rhs  ,post_hi -1  , index + 1 , in_hi , post , map);

            return node;

        }
    }

}
*/