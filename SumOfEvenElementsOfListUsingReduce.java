package org.example.STREAMS;

import java.util.Collections;
import java.util.List;

public class SumOfEvenElementsOfListUsingReduce {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,4,2,5,3,7,8,11,13,17);
        int reducedList=l.stream().filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println(reducedList);
    }
}
