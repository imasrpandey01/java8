package org.example.STREAMS;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CubePerformthenFilterMorethan50 {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(2,5,3,1,6,7,8);
        List<Integer> cubedNums= (List<Integer>)  numbers.stream().map(i->i*i*i).filter(i->i>50).collect(Collectors.toList());
   cubedNums.forEach(System.out::println);

    }
}
