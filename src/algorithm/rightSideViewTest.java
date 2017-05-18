package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
 

public class rightSideViewTest {

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if (root == null) return res;
		
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.push(root);
        q.push(null);
        
        while(!q.isEmpty()) {
        	TreeNode node = q.poll();
        	
        	if(node == null) {
        		if(q.isEmpty()){
        			break;
        		} else {
        			q.add(null);
        		}
        		
        	} else {
        		if(q.peek() == null) {
        			res.add(node.val);
        		}
        		if(node.left != null) {
        			q.add(node.left);
        		}
        		if(node.right != null) {
        			q.add(node.right);
        		}
        	}
        	
        }
        return res;
    }
	
	public static void main(String[] args) {

	}

}
