package binary.search.tree;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 */
public class BinarySearchTreeTest {

  private final BinarySearchTree bst = new BinarySearchTree();

  @Test
  public void insert() {
    loadNodes(this.bst);
    Node node5 = this.bst.find(new Node(5));
    Assert.assertEquals(2, node5.left.data());
    Assert.assertEquals(9, node5.right.data());

    Node nod15 = this.bst.find(new Node(1));
    Assert.assertEquals(0, nod15.left.data());
    Assert.assertEquals(5, nod15.right.data());

  }

  @Test
  public void find() {
    this.bst.clearAll();
    Assert.assertNull(this.bst.find(null));
    Assert.assertNull(this.bst.find(new Node(0)));

    this.bst.clearAll();
    this.bst.insert(new Node(1));
    this.bst.insert(new Node(5));
    this.bst.insert(new Node(9));
    this.bst.insert(new Node(8));
    this.bst.insert(new Node(6));
    this.bst.insert(new Node(0));

    Assert.assertEquals(new Node(0), this.bst.find(new Node(0)));
    Assert.assertEquals(new Node(1), this.bst.find(new Node(1)));
    Assert.assertEquals(new Node(5), this.bst.find(new Node(5)));
    Assert.assertEquals(new Node(6), this.bst.find(new Node(6)));
    Assert.assertNull(this.bst.find(new Node(7)));
    Assert.assertEquals(new Node(8), this.bst.find(new Node(8)));
    Assert.assertEquals(new Node(9), this.bst.find(new Node(9)));

  }

  @Test
  public void clearAll() {
    this.bst.clearAll();
    Assert.assertEquals(0, this.bst.size());
  }

  @Test
  public void delete() {
    loadNodes(this.bst);
    this.bst.displayAll();

    loadNodes(this.bst);
    this.bst.delete(new Node(0));
    this.bst.displayAll();

    loadNodes(this.bst);
    this.bst.delete(new Node(3));
    this.bst.displayAll();

    loadNodes(this.bst);
    this.bst.delete(new Node(2));
    this.bst.displayAll();

    loadNodes(this.bst);
    this.bst.delete(new Node(9));
    this.bst.displayAll();

  }

  @Test
  public void display() {
    this.bst.clearAll();
    this.bst.insert(new Node(1));
    this.bst.insert(new Node(5));
    this.bst.insert(new Node(9));
    this.bst.insert(new Node(8));
    this.bst.insert(new Node(6));
    this.bst.insert(new Node(0));
    this.bst.insert(new Node(15));
    this.bst.insert(new Node(8));

    Assert.assertEquals(7, this.bst.size());
    this.bst.displayAll();

  }

  private static void loadNodes(BinarySearchTree bst) {
    bst.clearAll();
    bst.insert(new Node(1));
    bst.insert(new Node(5));
    bst.insert(new Node(9));
    bst.insert(new Node(8));
    bst.insert(new Node(6));
    bst.insert(new Node(0));
    bst.insert(new Node(2));
    bst.insert(new Node(3));
    bst.insert(new Node(15));
    bst.insert(new Node(10));
    bst.insert(new Node(16));
    bst.insert(new Node(12));
    bst.insert(new Node(11));
  }

}
