package com.company;

import java.util.Arrays;

public class Lesson6MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);

        // Large double negative may help create the largest
        int result1, result2, result3, result4;
        result1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        result2 = A[A.length - 1] * A[0] * A[1];
        result3 = A[0] * A[1] * A[2];
        result4 = A[A.length - 1] * A[A.length - 2] * A[0];

        return Math.max(
                Math.max(result1, result2), Math.max(result3, result4)
        );
    }

    public static void main(String[] args) {
        Lesson6MaxProductOfThree l = new Lesson6MaxProductOfThree();
        System.out.println(l.solution(new int[]{-3, 1, 2, -2, 5, 6}));
        System.out.println(l.solution(new int[]{-10, -2, -4}));
        System.out.println(l.solution(new int[]{-10, -2, 4}));
        System.out.println(l.solution(new int[]{-10, -2, 1, 2, 3, 4}));
    }
}
