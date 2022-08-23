package com.company;

public class Lesson9MaxProfit {


    /*
    Detected time complexity: O(N)
    100% Correct, 100% Performance
     */

    public int solution2(int[] A) {
        int bestProfit = 0, lowest = Integer.MAX_VALUE;

        for (int i = 1; i < A.length; i++) {
            lowest = Math.min(A[i - 1], lowest);
            bestProfit = Math.max(bestProfit, A[i] - lowest);
        }

        return bestProfit;
    }

    /*
    Detected time complexity: O(N**2)
    100% Correct, 25% performance

     */
    public int solution(int[] A) {
        int bestProfit = 0;

        for (int i = 0; i < A.length; i++) {

            for (int j = i; j < A.length; j++) {
                int currentProfit = A[j] - A[i];
                if (currentProfit > bestProfit) {
                    bestProfit = currentProfit;
                }
            }
        }
        return bestProfit;
    }


    public static void main(String[] args) {
        Lesson9MaxProfit l = new Lesson9MaxProfit();
        int[] arr = new int[]{23171, 21011, 21123, 21366, 21013, 21367};    // 356 ( 1 - > 5)
        System.out.println(l.solution(arr));
        System.out.println(l.solution2(arr));
    }
}
