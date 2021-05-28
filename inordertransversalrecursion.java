package fibonacciseries;
import java.util.Stack;
public class inordertransversalrecursion 

  { public static void main(String[] args) throws Exception {
	  // construct the binary tree given in question 
	  BinaryTree bt = BinaryTree.create(); 
	  // traversing binary tree on InOrder traversal without recursion 
	  System.out.println("printing nodes of binary tree on InOrder using iteration");
	  bt.inOrderWithoutRecursion(); } } class BinaryTree { static class TreeNode { 
		  String data; TreeNode left, right; TreeNode(String value) {
			  this.data = value; left = right = null; } boolean isLeaf() { 
				  return left == null ? right == null : false; } } 
	  // root of binary tree TreeNode root; public void inOrderWithoutRecursion() 
	  { Stack<TreeNode> nodes = new Stack<>(); TreeNode current = root; 
	  while (!nodes.isEmpty() || current != null) { if (current != null) 
	  { nodes.push(current); current = current.left; } else { TreeNode node = nodes.pop();
	  System.out.printf("%s ", node.data); current = node.right; } } } 
	  /** * Java method to create binary tree with test data * * @return a sample binary tree for testing */ 
	  public static BinaryTree create() { BinaryTree tree = new BinaryTree(); 
	  TreeNode root = new TreeNode("40"); tree.root = root; tree.root.left = new TreeNode("20"); 
	  tree.root.left.left = new TreeNode("10"); tree.root.left.left.left = new TreeNode("5"); 
	  tree.root.left.right = new TreeNode("30"); tree.root.right = new TreeNode("50");
	  tree.root.right.right = new TreeNode("60"); tree.root.right.right.left = new TreeNode("67"); 
	  tree.root.right.right.right = new TreeNode("78"); return tree; 
	  } }
  }


