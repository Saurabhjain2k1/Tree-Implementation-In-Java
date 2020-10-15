package DsAlgo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class DiagonalTraversal {

	public static void main(String[] args) {
		 Node root = new Node(8); 
	        root.left = new Node(3); 
	        root.right = new Node(10); 
	        root.left.left = new Node(1); 
	        root.left.right = new Node(6); 
	        root.right.right = new Node(14); 
	        root.right.right.left = new Node(13); 
	        root.left.right.left = new Node(4); 
	        root.left.right.right = new Node(7); 
	          
	        traverse(root); 

	}
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	public static void traverse(Node root) {
		 HashMap<Integer,Vector<Integer>>hmp = new HashMap<>();
		 diagonalTraverse(root,0,hmp);
		 for(Entry<Integer, Vector<Integer>>e:hmp.entrySet()) {
			 System.out.println(e.getValue());
		 }
	}
	private static void diagonalTraverse(Node root, int d, HashMap<Integer, Vector<Integer>> hmp) {
		if(root==null)return;
		Vector<Integer>v = hmp.get(d);
		if(v==null) {
			v= new Vector<Integer>();
			v.add(root.data);
		}else {
			v.add(root.data);
		}
		hmp.put(d, v);
		diagonalTraverse(root.left, d+1, hmp);
		diagonalTraverse(root.right, d, hmp);
		
	}

}
