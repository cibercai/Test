
package polymorphism;

import java.io.IOException;

/**
 * @author Ciber Cai
 * @since 4 Aug 2016
 */
public class MyOverride {

  public static void main(String[] args) {
    MyInterface o1 = new MyOverride1();
    try {
      System.out.println(o1.myNumber());
    } catch (Exception e2) {
      e2.printStackTrace();
    }

    MyInterface o2 = new MyOverride2();
    try {
      System.out.println(o2.myNumber());
    } catch (Exception e1) {
      e1.printStackTrace();
    }

    MyInterface o3 = new MyOverride3();
    try {
      System.out.println(o3.myNumber());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

class MyOverride1 implements MyInterface {

  @Override
  public Number myNumber() {
    return 1;
  }
}

class MyOverride2 implements MyInterface {

  @Override
  public Integer myNumber() {
    return 2;
  }
}

class MyOverride3 implements MyInterface {

  @Override
  public Number myNumber() throws IOException {
    return 3;
  }
}
