package com.company;

import java.util.Arrays;

/*
Time spent: ~30 min

Detected time complexity:
O(N) or O(N*log(N))
 */

public class Lesson2OddOccurrencesInArray {
    public int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }

        Arrays.sort(A);

        int i = 0;
        while (i < A.length - 1) {
            if (A[i] == A[i + 1]) {
                i += 2;
            } else {
                return A[i];
            }
        }

        return A[A.length - 1];
    }

    public static void main(String[] args) {
        Lesson2OddOccurrencesInArray l = new Lesson2OddOccurrencesInArray();
        int[] arr = new int[]{9, 3, 9, 3, 9, 7, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("answer: " + l.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        // Sorted: [3, 3, 7, 9, 9, 9, 9]
        // Index:  [0, 1, 2, 3, 4, 5, 6]    L: 3
    }
}
