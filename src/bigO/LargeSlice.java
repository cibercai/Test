package bigO;

public class LargeSlice {

  public int solution(int[] A, int S) {
    if (S > 2 || S < -2) return -1;
    System.out.println("here");
    int slide = -1;
    int total = S;

    for (int i = 0; i < A.length; i++) {
      total = S - A[i];

      if (total == 0) {}

      for (int j = i; j < A.length; j++) {
        total = total + A[j];
        if (total == S) {
          int tmp = j - i + 1;
          if (tmp > slide) {
            slide = tmp;
          }
        }

      }
    }

    return slide;
  }

  public static void main(String[] args) {

    int[] A = { 1, 0, -1, 1, 1, -1, -1 };

    LargeSlice l = new LargeSlice();
    int no = l.solution(A, 2);
    System.out.print("no " + no);

  }

}
