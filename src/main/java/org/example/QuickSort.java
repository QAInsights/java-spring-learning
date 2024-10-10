package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgo {

  @Override
  public int sort(int[] arr) {
    return 5;
  }
}
