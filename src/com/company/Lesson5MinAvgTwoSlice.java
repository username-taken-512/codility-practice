package com.company;

public class Lesson5MinAvgTwoSlice {

    /*
    Detected time complexity: O(N)
     */

    public int solution(int[] A) {
        double lowest = Double.MAX_VALUE, two, three;
        int resultIndex = 0;

        if (A.length == 2) {
            return 0;
        }

        // Loop backwards, prefer the earlier index
        for (int i = A.length - 1; i > 1; i--) {
            two = (A[i] + A[i - 1]) / 2d;
            three = (A[i] + A[i - 1] + A[i - 2]) / 3d;

            if (three <= two) {
                if (three <= lowest) {
                    lowest = three;
                    resultIndex = i - 2;
                }
            } else {
                if (two <= lowest) {
                    lowest = two;
                    resultIndex = i - 1;
                }
            }
        }
        // Last case, not covered by loop
        two = (A[0] + A[1]) / 2d;

        return two <= lowest ? 0 : resultIndex;
    }

    public static void main(String[] args) {
        Lesson5MinAvgTwoSlice l = new Lesson5MinAvgTwoSlice();
//        System.out.println(l.solution(new int[]{4, 2, 2, 5, 1, 5, 8})); // 1
//        System.out.println(l.solution(new int[]{4, 2, 2, 5, 1, 1, 1})); // 4
//        System.out.println(l.solution(new int[]{4, 2, 2, 5, 2, 1, 1})); // 5
//        System.out.println(l.solution(new int[]{4, 2, 2, 5, 1, 2, 1})); // 4
//        System.out.println(l.solution(new int[]{1, 1, 1, 1, 1, 1, 1})); // 0
//        System.out.println(l.solution(new int[]{1, 9, 1, 1, 1, 1, 1})); // 2
//        System.out.println(l.solution(new int[]{1, 1, 2, 2})); // 0
//        System.out.println(l.solution(new int[]{3, 3, 2, 2})); // 2
//        System.out.println(l.solution(new int[]{5, 6, 3, 4, 9})); // 2
        System.out.println(l.solution(new int[]{1, 1, 9, 2, 2})); // 0
    }
}
