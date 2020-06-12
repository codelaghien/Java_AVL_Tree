public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Balanced Binary Search Tree - AVL Tree \n"); 
		System.out.print("Cây cân bằng - CNP \n"); 
		
		AVLTree avlTree = new AVLTree();
		avlTree.insert(100);
		avlTree.insert(200);
		avlTree.insert(300);
		avlTree.insert(400);
		avlTree.insert(500);
		avlTree.insert(600);
		avlTree.insert(700);
		avlTree.insert(800);
		avlTree.insert(900);
		avlTree.insert(1000);
		avlTree.insert(1100);
		avlTree.insert(1200);
		avlTree.insert(555);
		avlTree.printInOrder();
	} 
}
