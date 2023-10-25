package org.example.STREAMS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberFrequency {


        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5,5,4,6};

            boolean hasDuplicates = containsDuplicate(nums);

            if (hasDuplicates) {
                System.out.println("The array contains duplicates."+true);
            } else {
                System.out.println("All elements are distinct."+false);
            }
        }

        public static boolean containsDuplicate(int[] nums) {
            // Create a stream from the array and use Collectors.toSet() to get distinct values.
            // If the size of the set is not equal to the size of the original array, there are duplicates.
            return Arrays.stream(nums)
                    .boxed()
                    .collect(Collectors.toSet())
                    .size() != nums.length;
        }
    }


