import java.util.*;
public class BinaryTree {
static class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
static class Binarytree{
	static int idx=-1;
	public static Node buildTree(int nodes[]) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
		Node newNode= new Node(nodes[idx]);
		newNode.left=buildTree(nodes);
		newNode.right=buildTree(nodes);
		
		return newNode;
	}
}
public static void preorder(Node root) {
	if(root==null) {
		return;
	}
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}
public static void inOrder(Node root) {
	if(root==null) {
		return;
	}
	inOrder(root.left);
	System.out.print(root.data+" ");
	inOrder(root.right);
}
public static void postOrder(Node root) {
	if(root==null) {
		return;
	}
	postOrder(root.left);
	postOrder(root.right);
	System.out.print(root.data+" ");
}
public static void levelOrder(Node root) {
	if(root==null) {
		return;
	}
	Queue<Node> q=new LinkedList<>();
	q.add(root);
	q.add(null);
    
	while(!q.isEmpty()) {
		Node currNode=q.remove();
		if(currNode==null) {
			System.out.println();
			if(q.isEmpty()) {
				break;
			}
			else {
				q.add(null);
			}
		}
		else {
			System.out.print(currNode.data+" ");
			if(currNode.left!=null) {
				q.add(currNode.left);
			}
			if(currNode.right!=null) {
				q.add(currNode.right);
			}
		}
	}
}
public static int countNodes(Node root) {
	if(root==null) {
		return 0;
	}
	int leftcount=countNodes(root.left);
	int rightcount=countNodes(root.right);
	return leftcount+rightcount+1;
}
public static int sumNodes(Node root) {
	if(root==null) {
		return 0;
	}
	int leftsum=sumNodes(root.left);
	int rightsum=sumNodes(root.right);
	return leftsum+rightsum+root.data;
}
public static int Height(Node root) {
	if(root==null) {
		return 0;
	}
	int leftheight=Height(root.left);
	int rightheight=Height(root.left);
	int mx=Math.max(leftheight,rightheight);
	return mx+1;
}
public static int diameter(Node root) {
	if(root==null) {
		return 0;
	}
	int dia1=diameter(root.left);
	int dia2=diameter(root.right);
	int dia3=Height(root.left)+Height(root.right)+1;
	
	return Math.max(dia3,Math.max(dia1,dia2));
}
static class Treeinfo{
	int ht;
	int diam;
	Treeinfo(int ht,int diam){
		this.ht=ht;
		this.diam=diam;
	}
}
public static Treeinfo diameter2(Node root) {
	if(root==null) {
		return new Treeinfo(0,0);
	}
	Treeinfo left=diameter2(root.left);
	Treeinfo right=diameter2(root.right);
	
	int myHeight=Math.max(left.ht, right.ht)+1;
	
	int dia1=left.diam;
	int dia2=right.diam;
	int dia3=left.ht+right.ht+1;
	int mydia=Math.max(dia3,Math.max(dia2,dia1));
	
	Treeinfo myinfo=new Treeinfo(myHeight,mydia);
	return myinfo;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     Binarytree tree =new Binarytree();
     @SuppressWarnings("static-access")
	Node root=tree.buildTree(nodes);
    preorder(root);
    System.out.println(" ");
    inOrder(root);
    System.out.println(" ");
    postOrder(root);
    System.out.println(" ");
    levelOrder(root);
    System.out.println("No of total node is "+countNodes(root));
    System.out.println("Sum of total node is "+sumNodes(root));
    System.out.println("Height of the tree  is "+Height(root));
    System.out.println("Diameter of the tree is "+diameter(root));
    System.out.println("Diameter of the Tree  is "+diameter2(root).diam);
	}

}
