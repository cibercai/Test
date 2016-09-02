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
    String val = apply(no);

    return val;
  }

  public String apply(Integer no) {
    if (no <= 0) return "";
    if (this.numerals.containsKey(no)) {
      return this.numerals.get(no);
    } else {
      int small = this.numerals.floorKey(no);
      int left = no - small;
      int big = this.numerals.higherKey(no);
      int right = big - no;

      //contains
      if (this.numerals.containsKey(right)) {
        return apply(right) + this.numerals.get(big);
      } else {
        return this.numerals.get(small) + apply(left);
      }
    }
  }

}
