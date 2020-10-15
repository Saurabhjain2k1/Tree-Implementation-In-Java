package DsAlgo;

public class LevelOrder {
	static Node root;
	 static class Node 
		{ 
		    int data; 
		    Node left, right; 
		    public Node(int item) 
		    { 
		        data = item; 
		        left = right = null; 
		    } 
		} 
	public static void main(String[] args) {
		LevelOrder tree = new LevelOrder(); 
	      tree.root= new Node(1); 
	      tree.root.left= new Node(2); 
	      tree.root.right= new Node(3); 
	      tree.root.left.left= new Node(4); 
	      tree.root.left.right= new Node(5); 
	         
	      System.out.println("Level order traversal of binary tree is "); 
	      printLevelOrder(root); 

	}
	public static void printLevelOrder(Node root) {
		int height = height(root);
		for(int i=1;i<=height;i++) {
			printGivenLevel(root,i);
		}
	}
	private static void printGivenLevel(Node root, int i) {
		if(root==null)return;
		if(i==1) {
			System.out.println(root.data+" ");
		}else if(i>1) {
			printGivenLevel(root.left, i-1);
			printGivenLevel(root.right, i-1);
		}
		
		
	}
	public static int height(Node root) {
		if(root==null)return 0;
		int lheight = height(root.left);
		int rheight = height(root.right);
		if(lheight>rheight)return lheight+1;
		else return  rheight+1;
	}

}
