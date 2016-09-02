package bigO;

public class PairSumEvenCount {


  public int solution (int [] A) {
    int even = 0;
    int odd = 0;

    for (int i = 0; i < A.length; i ++) {
      if (A[i] % 2 == 0) {
        even++;
      } else {
        odd ++;
      }
    }
    System.out.println("event " + even);
    System.out.println("odd " + odd);

    int total = even * (even- 1) / 2 + odd * (odd -1 ) /2;


    return total;
  }



  public static void main(String[] args) {

    PairSumEvenCount p = new PairSumEvenCount ();

    int [] a ={1,2,3,4,5};

    System.out.println(p.solution(a));
  }
}
