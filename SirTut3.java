package org.example.STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SirTut3 {
    public static void main(String[] args) {
//        String s="awjrgaslerawerfbwla";
//        List<Integer> s= new ArrayList<>();
//        Stream<Integer> obj=s.stream();//first way to create Streams
//        Stream<Integer> obj1=Stream.of(1,2,3,56,4,2);

        Stream.Builder<String> obj3=Stream.builder();
        Stream<String> ob=obj3.add(new Scanner(System.in).next()).add(new Scanner(System.in).next())
                .add(new Scanner(System.in).next()).add(new Scanner(System.in).next())
                .add(new Scanner(System.in).next()).build();
    }

}
