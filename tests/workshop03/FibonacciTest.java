package workshop03;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by kond on 2017. 03. 03..
 */
public class FibonacciTest {
  Fibonacci f;

  @Before
  public void setUp() throws Exception {
    f = new Fibonacci();
  }

  @Test
  public void testGetFibonacciNumbersWithZero() throws Exception {
    assertEquals(0, f.getFibonacciNumbers(0).size());
  }

  @Test
  public void testGetFibonacciNumbersWithOne() throws Exception {
    assertEquals(Arrays.asList(0), f.getFibonacciNumbers(1));
  }

  @Test
  public void testGetFibonacciNumbersWithTwo() throws Exception {
    assertEquals(Arrays.asList(0, 1), f.getFibonacciNumbers(2));
  }

  @Test
  public void testGetFibonacciNumbersWithMany() throws Exception {
    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), f.getFibonacciNumbers(10));
  }

}