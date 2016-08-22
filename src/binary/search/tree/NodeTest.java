package binary.search.tree;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class NodeTest {

  @Test
  public void equal() {
    Node n1 = new Node(1);
    Node n11 = new Node(1);
    Node n0 = new Node(0);
    Node n = null;

    Assert.assertTrue(n1.equals(n11));
    Assert.assertFalse(n1.equals(n));
    Assert.assertFalse(n1.equals(n0));

  }

  @Test
  public void compareTo() {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(4);

    Assert.assertTrue(n1.compareTo(n2) < 0);
    Assert.assertTrue(n2.compareTo(n3) < 0);
    Assert.assertTrue(n1.compareTo(n3) < 0);
    Assert.assertTrue(n3.compareTo(n2) > 0);
  }

}
