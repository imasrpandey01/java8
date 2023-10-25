package org.example.STREAMS;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatedCharOfString {
    public static void main(String[] args) {
        Set<Character> set=new HashSet<>();
        List<Character> name=List.of('a','b','a','b','a','b','a','b','c','d');

        Set<Character> stringStream=name.stream().filter(set::add).collect(Collectors.toSet());
        stringStream.forEach(System.out::println);
    }
}
