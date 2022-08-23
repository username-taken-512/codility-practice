package com.company;

import java.util.Arrays;

/*
Detected time complexity: O(N*log(N)) or O(N)
 */

public class Lesson6Distinct {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int result = 1;
        Arrays.sort(A);
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Lesson6Distinct l = new Lesson6Distinct();
        System.out.println(l.solution(new int[]{2, 1, 1, 2, 3, 1}));
    }
}
