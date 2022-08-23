package com.company;

import java.util.Arrays;

public class Lesson4MaxCounters {
    /*
    Correctness: 100%
    Performance: 60%
     */
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxVal = 0;

        for (int item : A) {
            if (item == N + 1) {
                Arrays.fill(counters, maxVal);
            } else {
                counters[item - 1] += 1;
                if (counters[item - 1] > maxVal) {
                    maxVal = counters[item - 1];
                }
            }
            System.out.println(Arrays.toString(counters));
        }
        return counters;
    }

    /*
    Correctness: 100%
    Performance: 100%
    Detected time complexity: O(N + M)
     */

    public int[] solution2(int N, int[] A) {
        int[] counters = new int[N];
        int maxVal = 0, setMax = 0;

        for (int item : A) {
            if (item == N + 1) {
                setMax = maxVal;
            } else {
                if (counters[item - 1] < setMax) {
                    counters[item - 1] = setMax;
                }
                counters[item - 1] += 1;

                if (counters[item - 1] > maxVal) {
                    maxVal = counters[item - 1];
                }
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < setMax) {
                counters[i] = setMax;
            }
        }
        return counters;
    }

    public static void main(String[] args) {
        Lesson4MaxCounters m = new Lesson4MaxCounters();

        int N = 5;
        int [] arr = new int[]{3, 4, 4, 6, 1, 4, 4};

        System.out.println("result:" + Arrays.toString(m.solution2(N, arr)));
    }
}
