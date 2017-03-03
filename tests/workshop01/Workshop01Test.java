package workshop01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kond on 2017. 03. 03..
 */
public class Workshop01Test {
  Workshop01 ws;

  @Before
  public void before() {
     ws = new Workshop01();
  }

  @Test
  public void getApple() throws Exception {
    assertEquals("apple", ws.getApple());
  }

}