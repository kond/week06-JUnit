package workshop02;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kond on 2017. 03. 03..
 */
public class Workshop02Test {
  Workshop02 ws;
  ArrayList<Integer> numbers;

  @Before
  public void setUp() throws Exception {

  }

  @Test
  public void testSumWithEmptyList() throws Exception {
    numbers = new ArrayList<>();
    Workshop02 ws1 = new Workshop02(numbers);
    assertEquals(0,ws1.sum());
  }

  @Test
  public void testSumWithOneElement() throws Exception {
    numbers = new ArrayList<>(Arrays.asList(1));
    Workshop02 ws2 = new Workshop02(numbers);
    assertEquals(1, ws2.sum());
  }

  @Test
  public void testSumWithMultipleElements() throws Exception {
    numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    Workshop02 ws3 = new Workshop02(numbers);
    assertEquals(15, ws3.sum());
  }

  @Test (expected = NullPointerException.class)
  public void testSumWithWithNull() throws Exception {
    numbers = new ArrayList<>(Arrays.asList(null));
    Workshop02 ws4 = new Workshop02(numbers);
    assertEquals(0, ws4.sum());
  }
}