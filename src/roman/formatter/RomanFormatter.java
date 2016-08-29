package roman.formatter;

import java.util.TreeMap;

public class RomanFormatter {

  private final TreeMap<Integer, String> numerals = new TreeMap<>();

  public RomanFormatter() {
    this.numerals.put(1, "I");
    this.numerals.put(5, "V");
    this.numerals.put(10, "X");
    this.numerals.put(50, "L");
    this.numerals.put(100, "C");
  }

  public String format(Integer no) {
    if (no <= 0) return "";
    if (this.numerals.containsKey(no)) {
      return this.numerals.get(no);
    } else {
      int less = this.numerals.floorKey(no);
      int left = no - less;
      int higher = this.numerals.higherKey(no);
      int right = higher - no;

      //on left
      if (this.numerals.containsKey(right)) {
        return format(right) + this.numerals.get(higher);
      } else {
        // on right
        return this.numerals.get(less) + format(left);
      }

    }
  }

}
