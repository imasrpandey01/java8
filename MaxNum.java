package org.example.STREAMS;

import java.util.List;
import java.util.Optional;

public class MaxNum {
    public static void main(String[] args) {
        List<Integer> nums=List.of(1,2,4,5,6,7,8);
        //Optional<Integer> greatestNum=nums.stream().max((i, j)->i.compareTo(j));
        Optional<Integer> greatestNum= nums.stream().max(Integer::compare).get().describeConstable();
        System.out.println(greatestNum);
        {

        }
    }
}
