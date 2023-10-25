package org.example.STREAMS;

import java.util.List;
import java.util.stream.Collectors;

class ReversingAString{
    public static void main(String[] args) {
        List<String> sl=List.of("Abhinaw","Abhishek");
        List<String> rev= sl.stream().map(str->new StringBuilder(str).reverse().toString()).collect(Collectors.toList());
        String REVSUM=rev.stream().reduce("",(s1,s2)->s2+s1);

        rev.forEach(System.out::println);
        System.out.println(REVSUM);
    }
}