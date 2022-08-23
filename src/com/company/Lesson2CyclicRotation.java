package com.company;

import java.util.Arrays;

// Time spent: ~20 min

public class Lesson2CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] newArr = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            newArr[(i + K) % (A.length)] = A[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        Lesson2CyclicRotation l = new Lesson2CyclicRotation();
        int[] arr = new int[]{3, 8, 9, 7, 6};       // K = 3. Expected [9, 7, 6, 3, 8])
//        int[] arr = new int[]{1, 2, 3, 4};
        int k = 3;

        System.out.println(Arrays.toString(l.solution(arr, k)));
    }
}
