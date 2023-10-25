package org.example.STREAMS;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateWithFrequencyOfDuplication {
    public static void main(String[] args) {
        List<String> names=List.of("Abhinaw","Abhishek","Ritik","Aman","Abhinaw","Abhinaw","Abhinaw","Aman","Aman","Aman","Aman","Aman");
        Map<String,Long> mappednames=names.stream().filter(i-> Collections.frequency(names,i)>1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mappednames);
    }
}
