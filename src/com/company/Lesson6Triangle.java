package com.company;

import java.util.Arrays;

public class Lesson6Triangle {

    /*
    Detected time complexity: O(N*log(N))
     */

    public int solution(int[] A) {
        /*An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and
        A[P] + A[Q] > A[R],
        A[Q] + A[R] > A[P],
        A[R] + A[P] > A[Q].
         */

        /* Example: [1, 2, 5, 8, 10, 20]
        P = 0   10
        Q = 2   5
        R = 4   8
        N = 6
        */

        Arrays.sort(A);

        int N = A.length;
        long P, Q, R;   // Allow for large additions of maximum values
        for (int i = 0; i < N - 2; i++) {
            P = A[i];
            Q = A[i + 1];
            R = A[i + 2];

            if (P + Q > R && Q + R > P && R + P > Q) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Lesson6Triangle l = new Lesson6Triangle();
        System.out.println(l.solution(new int[]{10, 2, 5, 1, 8, 20}));  // 5, 8, 10
        System.out.println(l.solution(new int[]{Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2,  Integer.MAX_VALUE}));  // 5, 8, 10
    }
}
