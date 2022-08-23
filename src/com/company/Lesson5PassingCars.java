package com.company;

/*
Detected time complexity: O(N)
 */

public class Lesson5PassingCars {
    public int solution(int[] A) {
        int passes = 0;
        int sufSum = 0;

        for (int i = A.length - 1; i > -1; i--) {
            if (A[i] == 1) {
                sufSum++;
            } else {
                passes += sufSum;
            }

            if (passes > 1000000000) {
                return -1;
            }
        }

        return passes;
    }

    public static void main(String[] args) {
        Lesson5PassingCars l = new Lesson5PassingCars();
        System.out.println(l.solution(new int[]{0, 1, 0, 1, 1}));
    }
}
