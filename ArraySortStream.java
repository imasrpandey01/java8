package org.example.STREAMS;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraySortStream {
    public static void main(String[] args) {
        int [] ar={2,1,5,2,8,9,0};
        Arrays.parallelSort(ar);
        for (int i:ar){

            System.out.println(i);
        }
        Arrays.stream(ar).forEach(n-> System.out.println(n));

        }
        }

