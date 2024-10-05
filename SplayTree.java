class SplayTree {

  public Node root;
  public int size;

  public SplayTree() {
    root = null;
    size = 0;
  }

  public SplayTree(Node in) {
    root = in;
    size = 1;
  }

  public void insert(int val) {
    // Takes a value and inserts it into the tree as if it is a binary search tree,
    // then splay the node to the root of the tree since it was accessed most
    // recently.
    // Will not insert if a duplicate value - not supported by splay trees.
    if (root == null) {
      root = new Node(val);
    } else {
      Node curr = root;
      Node insertNode = new Node(val);
      // finding where curr fits into the tree and inserting it
      while (curr != null) {
        // branch to left subtree
        if (val < curr.getVal()) {
          if (curr.getLeft() == null) {
            curr.setLeft(insertNode);
          }
          curr = curr.getLeft();
        }
        // branch to right subtree
        else if (val > curr.getVal()) {
          if (curr.getRight() == null) {
            curr.setRight(insertNode);
          }
          curr = curr.getRight();
        }
        // do not insert the value, value already in the tree
        else if (val == curr.getVal()) {
          curr = null; // break out of loop
        }
      }

      // once value is inserted, splay the node to the root of the tree
      root = splay(root, val);

    }
    size++;
  }

  public Node remove(int val) {
      // If the value is in the tree, splay the node to the root of the tree, then
      // delete that node from the tree. If the value is not present in the tree,
      // do not do anything.
      if (root == null) {
        return null;
      }
      Node foundNode = search(val); // splays the node to the root of the tree if found
      if (foundNode == null) {
        return null; // does not remove anything, node not present in the tree
      }
      if (foundNode.getLeft() == null) {
        root = foundNode.getRight();
      } else if (foundNode.getRight() == null) {
        root = foundNode.getLeft();
      } else { // node has two children
        // find the max value in the left subtree and splay that value to the root
          Node right = foundNode.getRight();
          Node max = findMax(foundNode.getLeft(), foundNode.getLeft());
          root = splay(root, max.getVal());
          root.setRight(right);
      }
      return foundNode;
    }

    private Node findMax(Node subRoot, Node max) {
      // takes the root of the subtree and preforms like the search method to find the
      // maximum value, returns that node
      if (subRoot == null) {
        return null;
      }
      if (subRoot.getVal() > max.getVal()) {
        max = subRoot;
      }

      Node leftMax = findMax(subRoot.getLeft(), max);
      Node rightMax = findMax(subRoot.getRight(), max);
      if(leftMax != null){
        if (leftMax.getVal() > max.getVal()) {
          max = leftMax;
        }
      }
      if(rightMax != null){
        if (rightMax.getVal() > max.getVal()) {
          max = rightMax;
        }
      }
      return max;
    }

  public Node search(int val) {
    // do splay to get the value at the root
    root = this.splay(root, val);
    // if the splay tree is empty, return
    if (root == null){
      return null;
    }
    // if the value is not the root, it is not in the tree
    if (root.getVal() != val){
      return null;
    }
    // return the found value
    return root;

  }

  public Node leftRotate(Node node) {
    // Modified from CSC345's LLRB Trees Slides
    Node x = node.getRight();
    node.setRight(x.getLeft());
    x.setLeft(node);
    return x;
  }

  public Node rightRotate(Node node) {
    // Modified from CSC345's LLRB Trees Slides
    Node x = node.getLeft();
    node.setLeft(x.getRight());
    x.setRight(node);
    return x;
  }

  public Node splay(Node node, int val) {
    // If the node is null or the current value is equal to the value we are
    // trying to bring to the top, return the node (null is the node).
    if (node == null || node.getVal() == val) {
      return node;
    }
    // If the splay value is less than the current node's value, then we go to the
    // left.
    if (node.getVal() > val) {

      // If the left child is null, return the node.
      if (node.getLeft() == null) {
        return node;
      }

      // Otherwise, we start looking at the left child's value.

      // If the left child is greater than the splay value, we recursively call splay
      // on its left child.
      if (node.getLeft().getVal() > val) {
        node.getLeft().setLeft(splay(node.getLeft().getLeft(), val));

        // Rotate the node to the right.
        node = rightRotate(node);

        // If the left child is less than the splay value, we call splay on its right
        // child.
      } else if (node.getLeft().getVal() < val) {
        node.getLeft().setRight(splay(node.getLeft().getRight(), val));

        // If the left child's right child is not null, we are going to rotate the left
        // child.
        if (node.getLeft().getRight() != null) {
          node.setLeft(leftRotate(node.getLeft()));
        }
      }

      // After performing necessary rotations, if the left child is not null, we
      // rotate to the right.
      if (node.getLeft() == null) {
        return node;
      }
      return rightRotate(node);

      // If we don't look at the left child, we look at the right child.
    } else {
      // If the right child is null, return the node.
      if (node.getRight() == null) {
        return node;
      }
      // Otherwise, we start looking at the right child's value.

      // If the right child is greater than the splay value, we recursively call splay
      // on its left child.
      if (node.getRight().getVal() > val) {
        node.getRight().setLeft(splay(node.getRight().getLeft(), val));

        // If the right child's left child is not null, we are going to rotate the right
        // child.
        if (node.getRight().getLeft() != null) {
          node.setRight(rightRotate(node.getRight()));
        }

        // If the right child is less than the splay value, we call splay on its right
        // child.
      } else if (node.getRight().getVal() < val) {
        node.getRight().setRight(splay(node.getRight().getRight(), val));

        // Rotate the node to the left.
        node = leftRotate(node);
      }

      // After performing necessary rotations, if the right child is not null, we
      // rotate to the left.
      if (node.getRight() == null) {
        return node;
      }
      return leftRotate(node);
    }
  }

  public int size() {
    return size;
  }

  public void printInOrder() {
    System.out.print("InOrder: ");
    printInOrder(root);
    System.out.println();
    System.out.println();
  }

  private void printInOrder(Node n) {

    if (n == null)
      return;

    printInOrder(n.getLeft());

    System.out.print(n.getVal() + " ");

    printInOrder(n.getRight());
  }

  public void printTree() {
    System.out.println(" - PRINT TREE -");
    printTree(root, "");
    System.out.println();
  }

  private void printTree(Node n, String indent) {
    if (n == null) {
      System.out.println(indent + "NULL");
      return;
    } else {
      System.out.println(indent + n.getVal() + "|");
    }

    printTree(n.getRight(), indent + "   ");
    printTree(n.getLeft(), indent + "   ");

  }
}    