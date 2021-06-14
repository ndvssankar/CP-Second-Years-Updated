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
		assertEquals("1.", "JavPython", new RemoveDuplicate().removeDuplicate("JavaPython"));
      assertEquals("2.", "HeloWrd", new RemoveDuplicate().removeDuplicate("HelloWorld"));
      assertEquals("3.", "E", new RemoveDuplicate().removeDuplicate("EEE"));
      assertEquals("4.", "a ", new RemoveDuplicate().removeDuplicate("a a "));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", "12", new RemoveDuplicate().removeDuplicate("121212121"));
      assertEquals("2.",  "", new RemoveDuplicate().removeDuplicate(""));
      assertEquals("3.", "Test", new RemoveDuplicate().removeDuplicate("Test"));
      assertEquals("4.", "10", new RemoveDuplicate().removeDuplicate("1001"));
      assertEquals("5.", "10", new RemoveDuplicate().removeDuplicate("11110000"));
   }
}

