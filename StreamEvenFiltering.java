package org.example.STREAMS;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEvenFiltering {
    public static void main(String[] args) {
        int []ar={1,4,56,7,8,9};
        //Stream<Integer> st= (Stream<Integer>) Stream.of(ar).collect(Collectors.toList());
        int[] li= Arrays.stream(ar).filter(i->i%2==0).toArray();
        for (int i:li) {
            System.out.println(i);
        }
    }
}
