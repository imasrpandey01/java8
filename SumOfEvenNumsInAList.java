package org.example.STREAMS;

import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenNumsInAList {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,4,5,6,7,8,8);
        List<Integer> fl=l.stream().filter(i->i%2==0).
        map(i->i*i).collect(Collectors.toList());
        fl.forEach(System.out::println);
    }
}
