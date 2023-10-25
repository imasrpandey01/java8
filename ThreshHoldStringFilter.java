package org.example.STREAMS;

import java.util.List;
import java.util.stream.Collectors;

public class ThreshHoldStringFilter {
    public static void main(String[] args) {
        int thlength=10;
        List<String> names=List.of("Abhinaw Pandey","Shubham","Abhimanyu Singh");
        List<String> filteredNames=names.stream().filter(s -> s.length()<thlength).collect(Collectors.toList());
        filteredNames.forEach(System.out::println);
    }
}
