package com.company;

public class Lesson3PermMissingElem {

    /*
    Time spent: ~ 13 min

    Detected time complexity:
    O(N) or O(N * log(N))
     */

    public int solution(int[] A) {
        int count = A.length + 1, arrCount = 0;
        for (int i = 0; i < A.length; i++) {
            count += i + 1;
            arrCount += A[i];
        }

        return count - arrCount;
    }

    public static void main(String[] args) {
        Lesson3PermMissingElem l = new Lesson3PermMissingElem();
        System.out.println(l.solution(new int[]{2, 3, 1, 5}));
    }
}
