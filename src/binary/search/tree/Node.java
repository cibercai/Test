package binary.search.tree;

/**
 *
 */
public class Node implements Comparable<Node> {
  /** the node value */
  private final int _data;

  /** the left node **/
  Node left;

  /** the right node **/
  Node right;

  public Node(int data) {
    this._data = data;
    this.left = null;
    this.right = null;
  }

  public int data() {
    return this._data;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (!(obj instanceof Node)) return false;

    Node n = (Node) obj;
    return n.data() == this._data;
  };

  @Override
  public int hashCode() {
    return this._data / 5;
  };

  @Override
  public int compareTo(Node o) {
    if (o == null) return -1;
    if (this._data < o.data()) return -1;
    if (this._data == o.data()) return 0;
    if (this._data > o.data()) return 1;

    return 0;
  }

  @Override
  public String toString() {
    return "Node [ data: " + this._data
        + " left: "
        + (this.left != null ? this.left.data() : this.left)
        + " right:  "
        + (this.right != null ? this.right.data() : this.right)
        + " ]";
  }
}
