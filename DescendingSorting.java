package org.example.STREAMS;

import java.util.List;
import java.util.stream.Collectors;

public class DescendingSorting {
    public static void main(String[] args) {
        List<Integer> integerList=List.of(1,2,3,4,5,6,77,43,2,11);
        List<Integer> sortedList=integerList.stream().sorted((i,j)->(i>j)?-1:(i<j)?+1:0).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
