package spicy.chicken;

public class SpicyChicken {

  public static void main(String[] args) {
    int size = 10000000;
    long start1 = System.nanoTime();

    for (int i = 1; i < size; i++) {
      //System.out.print(i + " ");
      if (i % 2 == 0) {
        System.out.println("");
        continue;
      } else {
        boolean exMark = false;
        if (i % 3 == 0) {
          System.out.print("spicy");
          exMark = true;
        }
        if (i % 5 == 0) {
          System.out.print("chicken");
          if (exMark) {
            System.out.print("!");
            exMark = false;
          }
        }
        System.out.println("");
      }
    }

    long end1 = System.nanoTime() - start1;

    long start2 = System.nanoTime();
    for (int i = 1; i < size; i++) {
      //System.out.print(i + " ");
      boolean exMark = false;
      if (i % 3 == 0) {
        System.out.print("spicy");
        exMark = true;
      }
      if (i % 5 == 0) {
        System.out.print("chicken");
        if (exMark) {
          System.out.print("!");
          exMark = false;
        }
      }
      System.out.println("");
    }

    long end2 = System.nanoTime() - start2;

    System.out.println("\nfirst " + end1 / (1000 * 1000));
    System.out.println("second " + end2 / (1000 * 1000));

  }
}
