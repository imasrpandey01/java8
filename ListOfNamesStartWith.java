package org.example.STREAMS;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfNamesStartWith {

    public static void main(String[] args) {
        List<String> ls=List.of("Abhinaw","Anil","Uday","Ritik","Abhishek");
        List<String> filteredList=ls.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }
}
