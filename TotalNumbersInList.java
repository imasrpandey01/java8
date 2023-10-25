package org.example.STREAMS;

import java.util.List;
import java.util.stream.Stream;

public class TotalNumbersInList {
    public static void main(String[] args) {
        List<Integer> nums=List.of(1,2,3,4,7,8,9);
        long totalnums= nums.stream().count();
        System.out.println(totalnums);
    }
}
