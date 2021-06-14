/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals("1, ", 2, new MostFrequentDigit().mostFrequentDigit(24));
      assertEquals("2, ", 1, new MostFrequentDigit().mostFrequentDigit(0));
      assertEquals("3, ", 1, new MostFrequentDigit().mostFrequentDigit(26011));
      assertEquals("4, ", 0, new MostFrequentDigit().mostFrequentDigit(1102300));
   }

   @Test
   public void testCase2() {
      assertEquals("1, ", 1, new MostFrequentDigit().mostFrequentDigit(14));
      assertEquals("2, ", 2, new MostFrequentDigit().mostFrequentDigit(2));
      assertEquals("3, ", 5, new MostFrequentDigit().mostFrequentDigit(5));
      assertEquals("4, ", 1, new MostFrequentDigit().mostFrequentDigit(52311231));
      assertEquals("5, ", 5, new MostFrequentDigit().mostFrequentDigit(52355235));
   }
}