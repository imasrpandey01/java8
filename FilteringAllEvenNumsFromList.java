package org.example.STREAMS;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringAllEvenNumsFromList {
    public static void main(String[] args) {
        List<Integer> l=List.of(2,4,6,4,6,4,3,9,7,11,13,17);
        List<Integer> fl=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        fl.forEach(System.out::println);
    }
}
