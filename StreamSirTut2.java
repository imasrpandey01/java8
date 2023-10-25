package org.example.STREAMS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSirTut2 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Abhinaw","Abhishek");
        List<Character> uniqueCharacter=words.stream().flatMap(word-> word.chars().mapToObj(c->(char) c)).distinct().collect(Collectors.toList());
        System.out.println(uniqueCharacter);

    }
}

//Companies to Apply::





