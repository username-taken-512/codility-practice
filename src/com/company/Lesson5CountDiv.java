package com.company;

public class Lesson5CountDiv {
    public int solution(int A, int B, int K) {
        int b = B / K;
        int a = A / K;
        int zero = A % K == 0 ? 1 : 0;

        return b - a + zero;
    }

    /*
    Detected time complexity: O(1)
     */

    public int solution2(int A, int B, int K) {
        return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        Lesson5CountDiv l = new Lesson5CountDiv();
        System.out.println(l.solution(6, 11, 2));   // 3
        System.out.println(l.solution(4, 20, 10));  // 2
        System.out.println(l.solution(4, 15, 3));   // 4
        System.out.println(l.solution(0, 1, 11));   // 1
    }
}
