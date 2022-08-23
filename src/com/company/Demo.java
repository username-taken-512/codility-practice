package com.company;

import java.util.Arrays;

/*
Time spent: ~20 min
All tests passed

Detected time complexity: O(N) or O(N * log(N))
 */

public class Demo {
    public int solution(int[] A) {
        Arrays.sort(A); // Sortera

        int lowest = 1;
        for (int i = 0; i < A.length; i++) {
            // Skippa minustal då svaret måste vara > 0
            if (A[i] < 0) {
                continue;
            }

            // Hitta glapp i sorterad array
            if (A[i] == lowest) {
                lowest = A[i] + 1;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("5: " + d.solution(new int[]{1, 3, 6, 4, 1, 2}));    // 5
        System.out.println("7: " + d.solution(new int[]{5, 3, 6, 4, 1, 2}));    // 7
        System.out.println("4: " + d.solution(new int[]{1, 1, 6, 3, 1, 2}));    //
        System.out.println("2: " + d.solution(new int[]{1}));
        System.out.println("2: " + d.solution(new int[]{1, 1, 1, 1}));
        System.out.println("1: " + d.solution(new int[]{2, 2, 2, 2}));
        System.out.println("1: " + d.solution(new int[]{2}));
    }
}


/*
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Copyright 2009–2022 by Codility Limited. All Rights Re
 */
