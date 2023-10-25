package org.example.STREAMS;


import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static java.util.stream.StreamSupport.stream;

public class WordCountExample {
    public static void main(String[] args) {
        String sentence = "This is an example sentence for word counting using Java 8.";

        // Split the sentence into words using whitespace as a delimiter
        String[] words = sentence.split("\\s+");

        // Count the number of words
        long wordCount = words.length;

        System.out.println("Number of words in the sentence: " + wordCount);
    }
}

