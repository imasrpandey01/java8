package org.example.STREAMS;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementWithItsFrequency {
    public static void main(String[] args) {
        List<String> stringList=List.of("AA","BB","CC","AA","AA","AA");
        Map<String,Long> duplicatedCount= (Map<String, Long>) stringList.stream().filter(i-> Collections.frequency(stringList,i)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(duplicatedCount);

    }
}
