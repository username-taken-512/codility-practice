package com.company;

/*
Time spent: ~20 min

Detected time complexity: O(N) or O(N * log(N))
 */

public class Lesson4PermCheck {
    public int solution(int[] A) {
        int [] countArr = new int[A.length];

        for (int i : A) {
            if (i > A.length) {
                return 0;
            }
            countArr[i - 1] += 1;
        }

        for (int i : countArr) {
            if (i != 1) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Lesson4PermCheck l = new Lesson4PermCheck();

        System.out.println(l.solution(new int[]{4, 1, 3, 2}));  // 1
        System.out.println(l.solution(new int[]{4, 1, 3}));     // 0
        System.out.println(l.solution(new int[]{4, 3, 3}));     // 0
        System.out.println(l.solution(new int[]{1}));           // 1
    }
}
