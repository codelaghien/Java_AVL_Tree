public class AVLNode {
	public int key; 
	public int height; 
	public AVLNode left;
	public AVLNode right;
	
	public AVLNode(int key) {
		this.key = key; 
		this.height = 1;
		this.left = null;
		this.right = null;
	} 
	
	public void printInfo() {
		System.out.print("key: " + this.key + "; height: " + this.height + "\n"); 
	}
	 
	public boolean greaterThan(int key) {
		return this.key > key;
	} 
	
	public boolean lessThan(int key) {
		return this.key < key;
	} 
	
	public boolean equal(int key) {
		return this.key == key;
	}
}
