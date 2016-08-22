package polymorphism;

/**
 * Overload is doing in compile time.
 */
public class MyOverload {

  public void myOverload(String text) {
    System.out.println("myOverload text" + text);
  }

  public void myOverload(String text1, String text2) {
    System.out.println("myOverload text 1 " + text1 + " text 2 " + text2);
  }

  public void myOverload(int int1, String text2) {
    System.out.println("myOverload int1 1 " + int1 + " text 2 " + text2);
  }

  public static void main(String[] args) {
    MyOverload o = new MyOverload();

    o.myOverload("text");
    o.myOverload("text1", "text2");
    o.myOverload(1, "text1");
  }

}
