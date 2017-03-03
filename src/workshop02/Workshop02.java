package workshop02;

import java.util.ArrayList;

/**
 * Created by kond on 2017. 03. 03..
 */
public class Workshop02 {
  private ArrayList<Integer> numbers;

  Workshop02(ArrayList<Integer> numbers) {
    this.numbers = numbers;
  }

  public int sum() {
    int result = 0;
    for(int number : this.numbers) {
      result += number;
    }
    return result;
  }
}
