package workshop03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kond on 2017. 03. 03..
 */
public class Fibonacci {

  public ArrayList<Integer> getFibonacciNumbers(int n) {
    ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
    for(int i=0; i<n; i++) {
      if(i < 2) {
        fibonacciNumbers.add(i);
      } else {
        fibonacciNumbers.add(fibonacciNumbers.get(i-2) + fibonacciNumbers.get(i-1));
      }
    }
    return fibonacciNumbers;
  }

}
