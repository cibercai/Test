package roman.formatter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanFormatterTest {

  @Test
  public void test() {
    RomanFormatter formatter = new RomanFormatter();
    assertEquals("I", formatter.format(1));
    assertEquals("II", formatter.format(2));
    assertEquals("III", formatter.format(3));
    assertEquals("IV", formatter.format(4));
    assertEquals("V", formatter.format(5));
    assertEquals("VI", formatter.format(6));
    assertEquals("VII", formatter.format(7));
    assertEquals("VIII", formatter.format(8));
    assertEquals("IX", formatter.format(9));
    assertEquals("X", formatter.format(10));
    assertEquals("XI", formatter.format(11));
    assertEquals("XII", formatter.format(12));
    assertEquals("XIII", formatter.format(13));
    assertEquals("XIV", formatter.format(14));
    assertEquals("XV", formatter.format(15));
    assertEquals("XVI", formatter.format(16));
    assertEquals("XVII", formatter.format(17));
    assertEquals("XVIII", formatter.format(18));
    assertEquals("XIX", formatter.format(19));
    assertEquals("XX", formatter.format(20));
    assertEquals("XXX", formatter.format(30));
    assertEquals("XXXIX", formatter.format(39));
    assertEquals("XL", formatter.format(40));
    assertEquals("XLIV", formatter.format(44));
    assertEquals("XLVI", formatter.format(46));
  }

}
