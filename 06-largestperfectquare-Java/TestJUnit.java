/**
 * This JUnit tests the MyMath class methods.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy 
 * and paste the testcase2 along with the annotation @test
 * 
 * @author: Siva Sankar
 */


import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals(new MyMath().largestPerfectSquare(24), 16);
      assertEquals(new MyMath().largestPerfectSquare(25), 25);
      assertEquals(new MyMath().largestPerfectSquare(26), 25);
   }

   @Test
   public void testCase2() {
      assertEquals(new MyMath().largestPerfectSquare(14), 9);
      assertEquals(new MyMath().largestPerfectSquare(2), 1);
      assertEquals(new MyMath().largestPerfectSquare(5), 4);
   }
}