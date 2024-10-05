// Tests SplayTree's Insertion, Removal, and Searching

class SplayTreeTest {

  public static void testInsert(SplayTree tree, int val) {
    tree.insert(val);
    String rootVal;
    if (tree.root == null) {
      rootVal = "NULL";
    } else {
      rootVal = Integer.toString(tree.root.getVal());
    }

    System.out.println("");
    System.out.println("Insert: " + val + ",    Root is now " + rootVal + "\n-------");
    if (val == tree.root.getVal()) {

      System.out.println("SUCCESS! Inserted value becomes root\n");

    } else {
      System.out.println("ERROR: Inserted value is not the root\n");
    }

  }

  public static void testRemove(SplayTree tree, int val) {
    tree.remove(val);
    String rootVal;
    if (tree.root == null) {
      rootVal = "NULL";
    } else {
      rootVal = Integer.toString(tree.root.getVal());
    }

    System.out.println("");
    System.out.println("Remove: " + val + ",    Root is now " + rootVal + "\n-------");

  }

  public static void testSearch(SplayTree tree, int val) {
    Node n = tree.search(val);
    String rootVal;
    if (tree.root == null) {
      rootVal = "NULL";
    } else {
      rootVal = Integer.toString(tree.root.getVal());
    }

    System.out.println("");
    System.out.println("Search: " + val + ",    Root is now " + rootVal + "\n-------");

    if (n == null) {
      System.out.println("Node is not in tree\n");
    } else {
      if (val == tree.root.getVal()) {
        System.out.println("SUCCESS! Searched value becomes root\n");
      } else {
        System.out.println("ERROR! Searched value not equal to root\n");
      }
    }

  }

  public static void testInsertRoot1() {
    System.out.println("Test Insert 1\n-------------------------------------");
    SplayTree tree = new SplayTree();

    // Test Insertion of Nodes. Print on each iteration to see that rotations are
    // correct, and root
    // is the last element inserted
    testInsert(tree, 5);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 8);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 1);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 11);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 7);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 14);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 0);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 21);
    tree.printTree();
    tree.printInOrder();

  }

  public static void testInsertRoot2() {
    System.out.println("Test Insert 2\n-------------------------------------");
    SplayTree tree = new SplayTree();

    // Test Insertion of Nodes. Print on each iteration to see that rotations are
    // correct, and root
    // is the last element inserted
    testInsert(tree, 4);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 2);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 7);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 3);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 9);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 1);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 10);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 5);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 20);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 0);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 6);
    tree.printTree();
    tree.printInOrder();

    // Test that tree is in-order
    System.out.println();
    tree.printInOrder();
  }

  public static void testInsertRoot3() {
    System.out.println("Test Insert 3\n-------------------------------------");
    SplayTree tree = new SplayTree();

    // Test Insertion of Nodes. Print on each iteration to see that rotations are
    // correct, and root
    // is the last element inserted
    testInsert(tree, 0);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 1);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 2);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 3);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 4);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 6);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 7);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 8);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 9);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 10);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 5);
    tree.printTree();
    tree.printInOrder();

  }

  public static void testInsertRoot4() {
    System.out.println("Test Insert 4\n-------------------------------------");
    SplayTree tree = new SplayTree();

    // Test Insertion of Nodes. Print on each iteration to see that rotations are
    // correct, and root
    // is the last element inserted
    testInsert(tree, 5);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 3);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 10);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 8);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 2);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 4);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 7);
    tree.printTree();
    tree.printInOrder();

  }

  public static void testSearch1() {

    System.out.println("Test Search1\n-------------------------------------");
    SplayTree tree = new SplayTree();

    // Test Search of Nodes. Print on each iteration to see that rotations are
    // correct, and root
    // is the last element inserted
    testInsert(tree, 0);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 1);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 2);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 3);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 4);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 6);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 7);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 8);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 9);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 10);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 5);
    tree.printTree();
    tree.printInOrder();

    testSearch(tree, 6);
    tree.printTree();
    tree.printInOrder();
  }

  public static void testSearch2() {

    System.out.println("Test Search1\n-------------------------------------");
    SplayTree tree = new SplayTree();

    // Test Search of Nodes. Print on each iteration to see that rotations are
    // correct, and root
    // is the last element inserted
    testInsert(tree, 0);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 2);
    tree.printTree();
    tree.printInOrder();

    // 0 Brought to Root
    testSearch(tree, 0);
    tree.printTree();
    tree.printInOrder();

    // 5 Searched, not in Tree
    testSearch(tree, 5);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 5);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 7);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 4);
    tree.printTree();
    tree.printInOrder();

    // 2 Brought to Root
    testSearch(tree, 2);
    tree.printTree();
    tree.printInOrder();
  }

  public static void testRemove1() {

    System.out.println("Test Remove1\n-------------------------------------");
    SplayTree tree = new SplayTree();

    testInsert(tree, 8);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 1);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 11);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 7);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 14);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 0);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 21);
    tree.printTree();
    tree.printInOrder();

    // Remove until empty
    testRemove(tree, 8);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 21);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 0);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 11);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 14);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 7);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 1);
    tree.printTree();
    tree.printInOrder();

  }

  public static void testRemove2() {

    System.out.println("Test Remove2\n-------------------------------------");
    SplayTree tree = new SplayTree();

    testInsert(tree, 5);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 4);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 3);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 8);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 9);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 10);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 15);
    tree.printTree();
    tree.printInOrder();

    // Remove until empty
    testRemove(tree, 15);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 10);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 9);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 8);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 3);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 4);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 5);
    tree.printTree();
    tree.printInOrder();
  }

  public static void testRemove3() {

    System.out.println("Test Remove3\n-------------------------------------");
    SplayTree tree = new SplayTree();

    testInsert(tree, 9);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 6);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 8);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 7);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 2);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 1);
    tree.printTree();
    tree.printInOrder();

    testInsert(tree, 4);
    tree.printTree();
    tree.printInOrder();

    // Remove until empty
    testRemove(tree, 7);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 4);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 6);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 9);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 1);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 8);
    tree.printTree();
    tree.printInOrder();

    testRemove(tree, 2);
    tree.printTree();
    tree.printInOrder();
  }

  public static void main(String[] args) {

    String separator = "==========================================================\n==========================================================\n\n\n\n\n";

    testInsertRoot1();
    System.out.println(separator);

    testInsertRoot2();
    System.out.println(separator);

    testInsertRoot3();
    System.out.println(separator);

    testInsertRoot4();
    System.out.println(separator);

    testSearch1();
    System.out.println(separator);

    testSearch2();
    System.out.println(separator);

    testRemove1();
    System.out.println(separator);

    testRemove2();
    System.out.println(separator);

    testRemove3();

  }

}