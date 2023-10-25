package org.example.STREAMS;

import java.util.List;
import java.util.stream.Stream;

public class FirstElementOfIntegerTypeList {
    public static void main(String[] args) {
        List<Integer> numlist=List.of(3,5,1,534,34,3);
        Stream<Integer> firstElementInNumList=numlist.stream().findFirst().stream();
        firstElementInNumList.forEach(System.out::println);
    }
}
