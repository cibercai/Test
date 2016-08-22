package binary.search.tree;

/**
 *
 */
public class BinarySearchTree {

  private Node root;

  private int size = 0;

  public BinarySearchTree() {
    this.root = null;
    this.size = 0;
  }

  /**
   * @param node the Node.
   * @return the {@link Node} or null if cannot find it
   */
  public Node find(Node node) {
    Node current = this.root;
    while (current != null) {
      if (node.compareTo(current) < 0) {
        current = current.left;
      } else if (node.compareTo(current) > 0) {
        current = current.right;
      } else {
        return current;
      }
    }
    return null;
  }

  /**
   * @param node the {@link Node} needs to insert.
   */
  public void insert(Node node) {
    if (this.root == null) {
      this.root = node;
      this.size++;
      return;
    }

    Node current = this.root;
    Node parent = null;

    while (true) {
      // nothing
      if (current == null) {
        current = node;
        this.size++;
        return;
      }

      parent = current;
      if (node.compareTo(current) < 0) {
        current = current.left;
        parent.left = current != null ? current : node;
      } else if (node.compareTo(current) > 0) {
        current = current.right;
        parent.right = current != null ? current : node;
      } else {
        //same,  do nothing
        return;
      }
    }
  }

  /**
   * @param node the {@link Node} needs to delete
   */
  public void delete(Node node) {
    Node current = this.root;
    Node parent = null;
    Node delete = null;
    boolean isLeft = false;

    while (current != null) {
      if (node.compareTo(current) < 0) {
        parent = current;
        current = current.left;
        isLeft = true;
      } else if (node.compareTo(current) > 0) {
        parent = current;
        current = current.right;
        isLeft = false;
      } else {
        // find it.
        delete = current;
        break;
      }
    }

    // the leaf
    if (delete.left == null && delete.right == null) {
      if (isLeft) {
        parent.left = null;
      } else {
        parent.right = null;
      }
      // one one child
    } else if ((delete.left == null && delete.right != null) || (delete.left != null && delete.right == null)) {
      if (isLeft) {
        parent.left = delete.right;
      } else {
        parent.right = delete.right;
      }
      // have children
    } else if (delete.left != null && delete.right != null) {
      Node successor = successor(delete);
      parent.right = successor;
      successor.right = delete.right;
      successor.left = delete.left;
    }
  }

  /**
   * clear all Node.
   */
  public void clearAll() {
    if (this.root != null) {
      this.root.left = null;
      this.root.right = null;
    }
    this.root = null;
    this.size = 0;
  }

  /**
   * @return the total number of {@link Node} in the tree.
   */
  public int size() {
    return this.size;
  }

  /**
   *display the tree in order
   */
  public void displayAll() {
    display(this.root);
    System.out.println();
  }

  /**
   * @param node the node wants to display from.
   */
  public void display(Node node) {
    if (node != null) {
      display(node.left);
      System.out.print(node.data() + " ");
      display(node.right);
    }
  }

  /**
   * Try to find the smallest Node in the selective partial tree.
   * @param node the {@link Node}
   * @return the smallest {@link Node}
   */
  private static Node successor(Node node) {
    Node current = node.right;
    Node parent = node;
    Node successor = null;
    while (current != null) {
      if (current.left == null) {
        successor = current;
        break;
      } else {
        parent = current;
        current = current.left;
      }
    }
    parent.left = successor.right;
    successor.right = node.right;
    successor.left = null;

    return successor;
  }

  /**
   *
   */

}
