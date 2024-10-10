package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
  public static void main(String[] a) {

    int[] arr = {1, 2, 3};
    int search = 3;

    //        BinarySearchImpl bs = new BinarySearchImpl(arr, search, new BubbleSort());
    //        bs.search(arr, search);
    //        System.out.println(bs.search(arr, search));

    ApplicationContext applicationContext = SpringApplication.run(Main.class, a);

    BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);

    System.out.println(bs.sortAlgo);
    System.out.println(bs.search(arr, search));
  }
}
