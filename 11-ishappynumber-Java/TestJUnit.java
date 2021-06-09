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
		assertEquals("1.", false, new IsHappyNumber().isHappyNumber(-7));
      assertEquals("2.", true, new IsHappyNumber().isHappyNumber(1));
      assertEquals("3.", false, new IsHappyNumber().isHappyNumber(2));
      assertEquals("4.", false, new IsHappyNumber().isHappyNumber(98));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", false, new IsHappyNumber().isHappyNumber(405));
      assertEquals("2.", true, new IsHappyNumber().isHappyNumber(97));
      assertEquals("3.", true, new IsHappyNumber().isHappyNumber(404));
      assertEquals("4.", false, new IsHappyNumber().isHappyNumber(0));
   }
}