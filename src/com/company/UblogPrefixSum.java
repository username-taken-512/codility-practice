package com.company;

// https://www.youtube.com/watch?v=5fSsn5lytOw

public class UblogPrefixSum {
    public int firstProblem (int[] arr) {
        int totalSum = 0, leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        UblogPrefixSum u = new UblogPrefixSum();
        int[] arr = new int[]{-7, 1, 5, -2, -4, 3, 0};
        System.out.println(u.firstProblem(arr));
    }
}
