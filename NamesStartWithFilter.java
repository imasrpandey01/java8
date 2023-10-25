package org.example.STREAMS;

import java.util.List;
import java.util.stream.Collectors;

public class NamesStartWithFilter {
    public static void main(String[] args) {
        List<String> names=List.of("Abhinaw","Shhubham","Anurag","Anubhav");
        List<String> filteredNames=names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
        filteredNames.forEach(System.out::println);
    }
}
