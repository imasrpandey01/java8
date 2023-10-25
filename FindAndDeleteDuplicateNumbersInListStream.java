package org.example.STREAMS;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAndDeleteDuplicateNumbersInListStream {
    public static void main(String[] args) {
//        Stream<String> names= Stream.of("Abhinaw","Abhishek","Abhinaw","Abhinaw","Abhinaw");
//        Set<String> deuplicateNames= names.collect(Collectors.toSet());
//        deuplicateNames.forEach(System.out::println);
//    }

    Stream<Integer> numstream=Stream.of(1,2,3,4,5,6,7,12,3,4,5,6);
    Set<Integer> set=new HashSet<>();
    List<Integer> duplicatenums= numstream.filter(n->!set.add(n)).toList();
            duplicatenums.forEach(System.out::println);
    }
    }
