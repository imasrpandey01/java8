package org.example.STREAMS;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StringConcatanate {
    public static void main(String[] args) {
        List<String> ld=List.of("Abhinaw","Sunil");
        List<String> ldd=List.of("Kumar","Pandey");
        List<String> conld= Collections.singletonList(ld.stream().reduce(String.valueOf(""), (s1, s2) -> s1 + s2));
        Stream<String> concat=Stream.concat(ld.stream(),ldd.stream());
        concat.forEach(System.out::print);

       // conld.forEach(System.out::println);

    }
}
