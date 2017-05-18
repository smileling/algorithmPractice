package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class FindPath {
	private class Node {
		public Node left;
		public Node right;
		public int value;
	}
	
	//method1 递归
	public List<List<Integer>> pathSum(Node root, int sum) {//leetcode
		List<List<Integer>> path = new ArrayList<List<Integer>>();
		if (root == null) 
			return path;
		
		LinkedList<Node> s = new LinkedList<Node>();
		helper1(root, sum, s, path);
		
		return path;
	}
	
	private void helper1(Node node, int sum, LinkedList<Node> s, List<List<Integer>> path) {
		if (node == null) return;
		
		s.offerLast(node);

		if (sum == node.value && node.left == null && node.right == null) {
			List<Integer> p = new ArrayList<Integer>();
			for(Node nd : s) {
				p.add(nd.value);
			}
			path.add(p);
		}
		
		helper1(node.left, sum - node.value, s, path);
		helper1(node.right, sum - node.value, s, path);
		s.pollLast();
	}
	
	//method2 非递归 ？？？？？？？？
	public List<List<Integer>> pathSum2(Node root, int sum) {//leetcode
		List<List<Integer>> path = new ArrayList<List<Integer>>();
		if (root == null) 
			return path;
		
		LinkedList<Node> s = new LinkedList<Node>();
		HashSet<Node> visited = new HashSet<Node>();
		
		Node cur = root;
		int val = 0;
		s.offerLast(cur);
		visited.add(cur);
		val += cur.value;
		
		while (!s.isEmpty()) {
			while (cur.left != null) { // && !visited.contains(cur.left)
				s.offerLast(cur.left);
				cur = cur.left;
				val += cur.value;
				visited.add(cur);
//				System.out.println(cur.value);
			}
			System.out.println(cur.value);//
			if(cur.left == null && cur.right == null) {
				if (val == sum) {
					List<Integer> p = new ArrayList<Integer>();
					for(Node node : s) {
						p.add(node.value);
					}
					path.add(p);
					val -= cur.value;
					visited.add(cur);
					s.pollLast();
					cur = s.getLast();
//					System.out.println(cur.value);//
				} else {
					visited.add(cur);
					val -= cur.value;
					s.pollLast();
					cur = s.getLast();
					System.out.println(cur.value);//
				}
			}
			
			if (cur.right !=null) {
				if (!visited.contains(cur.right)) {
					cur = cur.right;
					val += cur.value;
//					visited.add(cur);
				} else {
					val -= cur.value;
					visited.add(cur);
					cur = s.pollLast();
				}
			} else if (visited.contains(cur.right)) {
				val -= cur.value;
				visited.add(cur);
				s.pollLast();
				cur = s.getLast();
			}
			
		}
		return path;
    }
	
	
	private void helper(Node node, int sum, LinkedList<Node> s, List<Node> path) {
		if (node == null) return;
		
		s.offerLast(node);

		if (path.size() > 0) return;
		if (sum == node.value && node.left == null && node.right == null) {
			for(Node nd : s) {
				path.add(nd);
			}
		}
		
		helper(node.left, sum - node.value, s, path);
		helper(node.right, sum - node.value, s, path);
		s.pollLast();
	}
	
	public List<Node> findPath(Node rootNode, int sum) {
		
		List<Node> res = new ArrayList<Node>();
		
		if (rootNode == null) 
			return res;
		
		LinkedList<Node> s = new LinkedList<Node>();
		helper(rootNode, sum, s, res);
		
		return res;
	}
	
	//????
	public List<Node> findPath2(Node rootNode, int sum) {
		LinkedList<Node> s = new LinkedList<Node>();
		List<Node> path = new ArrayList<Node>();
		Node cur = rootNode, pre = null;
		int val = 0;
		while (cur != null || !s.isEmpty()) {
			while (cur != null) {
				s.addLast(cur);
				val += cur.value;
				cur = cur.left;
			}
			cur = s.pollLast();
			if(cur.left == null && cur.right == null && val == sum) {
				for(Node node : s) {
					path.add(node);
				}
				return path;
			}
			if (cur.right !=null && cur.right != pre) {
				cur = cur.right;
			} else {
				pre = cur;
				val -= cur.value;
				s.pollLast();
				cur = null;
			}
			
		}
		return path;
	}
	
	public void printTree(Node root) {

		if (root == null) return;
		
		LinkedList<Node> q = new LinkedList<Node>();
		q.offerLast(root);
		q.offerLast(null);
		
		while(!q.isEmpty()) {
			Node cur = q.pollFirst();
			if(cur == null) {
				System.out.println();
				if(q.isEmpty()) return;
				else
					q.offerLast(null);
			} else {
				System.out.print(cur.value + "  ");
				if(cur.left != null) {
					q.offerLast(cur.left);
				}
				if(cur.right != null) {
					q.offerLast(cur.right);
				}
				
			}
			
		}
	}

	public Node gernerateTree(List<Integer> list) {
		//list = [5,4,8,11,null,13,4,7,2,null,null,5,1];
		LinkedList<Node> q = new LinkedList<Node>();
		
		int i = 0;
		Node node = new Node();
		node.value = list.get(0);
		q.offerLast(node);
		Node root = node;

		while(i < list.size()) {
			Node cur = q.pollFirst();
			
			i++;
			if ( i < list.size() && list.get(i) != null) {
				int val = list.get(i);
				node = new Node();
				node.value = val;
				cur.left = node;
				q.offerLast(node);
			} else if (i < list.size()) {
				cur.left = null;
			}
						
			i++;
			if( i < list.size() && list.get(i) != null) {
				int val = list.get(i);
				node = new Node();
				node.value = val;
				cur.right = node;
				q.offerLast(node);
			} else if (i < list.size()) {
				cur.right = null;
			}
		}
		
		while(!q.isEmpty()) {
			Node cur = q.pollFirst();
			cur.left = null;
			cur.right = null;
		}
		
		return root;
	}
	
	public static void main(String[] args) {

		List<List<Integer>> path = new ArrayList<List<Integer>>();
		List<Integer> val = new ArrayList<Integer>();
		val.add(1);
		val.add(2);
		path.add(val);
		System.out.println(path);
		
		List<Integer> list = new ArrayList<Integer>();
		
		//list = [5,4,8,11,null,13,4,7,2,null,null,5,1];
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(11);
		list.add(null);
		list.add(13);
		list.add(4);
		list.add(7);
		list.add(2);
		list.add(null);
		list.add(null);
		list.add(5);
		list.add(1);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(3) == null);
		
		FindPath fp = new FindPath();
		Node tree = fp.gernerateTree(list);
		fp.printTree(tree);
		
		System.out.println(tree.value);
		System.out.println(fp.pathSum(tree, 22));
		System.out.println(fp.findPath(tree, 22));
		System.out.println( );
		List<Node> p = new ArrayList<Node>();
		p = fp.findPath(tree, 22);
		for (Node nd : p) {
			System.out.print(nd.value + " ");
		}
		
		
//		HashSet<Node> visit = new HashSet<Node>();
//		visit.add(tree);
//		System.out.println(visit);
//		System.out.println(visit.contains(tree));
//		visit.remove(tree);
//		System.out.println(visit);
		
	}

}
