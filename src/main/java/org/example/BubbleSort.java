package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgo {

  @Override
  public int sort(int[] arr) {
    return 2;
  }
}
