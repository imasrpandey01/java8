package org.example.STREAMS;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    static String r=",";
    public static void main(String[] args) {
        List<String> list=List.of("i","am","Abhinaw","Pandey");
        Map<String,Long> ll= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(ll);

    }
}
