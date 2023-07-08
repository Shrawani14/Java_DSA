
public class HeightTree {

	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static int height(Node root){
		if(root == null){
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh) + 1;
	}
	
	public static int count(Node root){
		if(root == null){
			return 0;
		}
		int lcount = count(root.left);
		int rcount = count(root.right);
		int treecount = lcount + rcount + 1;
		return treecount;
	}
	
	public static int diameter(Node root){
		if(root == null){
			return 0;
			
		}
		int leftDiam = diameter(root.left);
		int rigthDiam = diameter(root.right);
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		int selfDiam = lheight + rheight + 1;
		return Math.max(selfDiam, Math.max(leftDiam, rigthDiam));
	}
	
	static class Info{
		int diam;
		int ht;
		Info(int diam , int ht){
			this.diam = diam;
			this.ht = ht;
		}
	}
	
	public static Info diameterN(Node root){
		if(root == null){
			return new Info(0,0);
		}
		Info leftInfo = diameterN(root.left);
		Info rightInfo = diameterN(root.right);
		int finalDiam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
		
		int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
		return new Info(finalDiam , ht);
	}
	
	public static void main(String[] args) {
		
//				 1
//			   /   \
//			  2     3
//			 / \   / \
//			4   5  6  7
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("count = "+count(root));
		
		System.out.println("Diameter = "+diameterN(root).diam);
		System.out.println("Height = "+diameterN(root).ht);
//		System.out.println("Sum = "+sum(root));
	}

}
