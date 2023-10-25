package org.example.STREAMS;

import java.util.List;

public class StreamSirTut1 {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,9,0);
        int sum=numbers.stream().reduce(2,(acc,element)->(acc +element));
        System.out.println(sum);
        //reduce method takes a stream and gives the unary output
    }
}
