===================================================================
                         Splay Trees
Authors: AJ Cronin, Brooke Stetson, Daniel Reynaldo, Nathan Osborne
===================================================================
Node.java:
	Node (int val): 
		The constructor for the Node Class. Initializes the value, left child, and right child (children set to null).

	int getVal():
		Returns the value of the given node.

	void setVal(int val):
		Sets the value of the given node.

	Node getLeft():
		Returns the node found at the left child of the current node.

	void setLeft(Node in):
		Sets the left child of the node to the given node.

	Node getRight():
		Returns the node found at the right child of the current node.

	void setRight(Node in):
		Sets the right child of the node to the given node.



SplayTree.java:
	SplayTree():
		The constructor for the Splay Tree where the tree starts out with no nodes in it and a size of 0.

	SplayTree(Node in):
		The constructor for the Splay Tree where the tree starts out with the node "in" as the root and a size of 1.

	void insert (int val):
		Takes a value and inserts it to the tree obeying BST structure and then splays the node to the top for easy access.		

	void remove (int val):
		If the value is in the tree, we splay the value to the root of the tree and remove it and then restructure it to follow BST rules. If it is not found, we return null.		
	
	Node findMax(Node subRoot, Node max):
		Looks at a subtree and finds the maximum value of that subtree.	

	Node search(int val, Node node):
		Splays a value to the root of the tree and returns the root. If the value was not found in the tree, the root will not match the search value and we return null.

	Node leftRotate(Node node):
		Performs a left rotate on a given node.

	Node rightRotate(Node node):
		Performs a right rotate on a given node.

	Node splay(Node node, int val):
		Takes a value in and searches for it recursively in the tree. If it is found, a series of rotations will occur to make it the new root of the tree for easy access in other functions.

	void printInOrder():
		Prints an in-order traversal of the entire tree.

	void printInOrder(Node n):
		Helper method for printing the tree in order, it calls itself recursively to traverse the tree.

	void printTree():
		Prints the tree in a way that allows you to visually see parents and their children.

	void PrintTree(Node n, String indent):
		Helper method for printing the entire tree it keeps track of the current node being observed and the amount of indentation needed depending on what level of the tree is being currently printed. 
	

SplayTreeTest.java:
	
	This serves as the testing file to make sure that splay tree runs properly. By running the code, you can see how it works with trees already provided. If more testing is wanted, you can use the testInsert, testRemove, testSearch
	to perform those operations which will provide new information about what the root looks like to show that it was properly splayed. You can also check if BST structure is mainted by checking if in-order Traversal is sorted.
