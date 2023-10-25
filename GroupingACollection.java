package org.example.STREAMS;

import java.util.Collections;
import java.util.List;

public class GroupingACollection {
    public static void main(String[] args) {
        List<String> list=List.of("abc","andjf","efgrsdfg","asd","d","dsfasd","dsfgafd");
        List<String> maxstring= Collections.singletonList(list.stream().max((s1, s2) -> (s1.length()>s2.length())?+1:
                (s1.length()<s2.length()?-1:0)).orElse(""));
        maxstring.forEach(System.out::println);


    }
}
