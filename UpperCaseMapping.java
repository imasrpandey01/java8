package org.example.STREAMS;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.awt.SystemColor.text;

public class UpperCaseMapping {
    public static void main(String[] args) {

            List<String> sl = List.of("Abhinaw","anup","rahul","pawan","shubhman");
            List<String> mappedlist=sl.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
            mappedlist.forEach(System.out::println);


        }
    }
