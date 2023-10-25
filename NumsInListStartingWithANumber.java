package org.example.STREAMS;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.spi.ToolProvider.findFirst;

public class NumsInListStartingWithANumber {
    public static void main(String[] args) {
        Stream<Integer> number= Stream.of(121,345,111,123,657,432,321,321);
        List<String > nmbersStartingWithOne=number.map(i->i+"").filter(i->i.startsWith("1")).collect(Collectors.toList());
        nmbersStartingWithOne.forEach(System.out::println);


    }
}
