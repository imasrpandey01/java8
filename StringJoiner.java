package org.example.STREAMS;

import java.util.List;
import java.util.stream.Collectors;

public class StringJoiner {
    public static void main(String[] args) {
        List<String> ls=List.of("abhinaw","Pandey");
        String sumoflist= ls.stream().collect(Collectors.joining(""));
        System.out.println(sumoflist);
    }
}