
public class BinaryTree {

	Node root;
	public BinaryTree() {
		root= null;
		// TODO Auto-generated constructor stub
	}
	public void addNode(Node start, Node newNode){
		if(root == null){
			root = newNode;
			return;
		}
		if(newNode.value > start.value){
			if(start.right == null){
				start.right = newNode;
			}
			addNode(start.right,newNode);
		}
	}
	
}
