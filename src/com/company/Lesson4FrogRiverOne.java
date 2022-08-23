package com.company;

import java.util.HashSet;

/*
Time spent: ~45 min
Detected time complexity: O(N)
 */

public class Lesson4FrogRiverOne {
    public int solution(int X, int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i < X + 1; i++) {
            set.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            set.remove(A[i]);
            if (set.isEmpty()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Lesson4FrogRiverOne l = new Lesson4FrogRiverOne();
        int[] arr = new int [] {1, 3, 1, 4, 2, 3, 5, 4};
        int x = 5;

        System.out.println(l.solution(x, arr));
    }
}
