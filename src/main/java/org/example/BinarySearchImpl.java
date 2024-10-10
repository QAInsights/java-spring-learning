package org.example;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

  private int[] arr;

  private int searchNumber;

  @Autowired SortAlgo sortAlgo;

  public int[] getArr() {
    return arr;
  }

  public void setArr(int[] arr) {
    this.arr = arr;
  }

  public BinarySearchImpl(SortAlgo sortAlgo) {
    this.sortAlgo = sortAlgo;
  }

  @Autowired
  public BinarySearchImpl() {}

  public int getSearchNumber() {
    return searchNumber;
  }

  public void setSearchNumber(int searchNumber) {
    this.searchNumber = searchNumber;
  }

  public SortAlgo getSortAlgo() {
    return sortAlgo;
  }

  public void setSortAlgo(SortAlgo sortAlgo) {
    this.sortAlgo = sortAlgo;
  }

  public int search(int[] arr, int searchNumber) {
    // Sort
    return sortAlgo.sort(arr);
  }
}
