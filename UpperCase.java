package org.example.STREAMS;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> ls=List.of("Abhinaw","Pandey");
        List<String> upperlist= ls.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        upperlist.forEach(System.out::println);

    }
}
