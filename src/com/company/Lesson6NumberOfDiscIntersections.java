package com.company;

import java.util.Arrays;

public class Lesson6NumberOfDiscIntersections {

    /*
    Solution from: https://www.youtube.com/watch?v=HV8tzIiidSw

    Detected time complexity: O(N*log(N)) or O(N)
     */
    public int solution(int[] A) {
        if (A.length < 1) {
            return 0;
        }

        // 1
        long[] diskStartPoints = new long[A.length];
        long[] diskEndPoints = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            diskStartPoints[i] = (i - (long) A[i]);
            diskEndPoints[i] = (i + (long) A[i]);
        }

        // 2
        Arrays.sort(diskStartPoints);
        Arrays.sort(diskEndPoints);

        // 3
        int openDisks = 0, intersections = 0, endPointIndex = 0;
        long startPoint, endPoint = diskEndPoints[0];

        for (int i = 0; i < diskStartPoints.length; i++) {
            startPoint = diskStartPoints[i];
            while (endPoint < startPoint) {
                if (endPointIndex == diskEndPoints.length) {
                    return intersections;
                }
                openDisks--;
                endPoint = diskEndPoints[++endPointIndex];
            }

            intersections += openDisks;
            openDisks++;

            if (intersections > 10000000) {
                return -1;
            }
        }
        return intersections;
    }

    public static void main(String[] args) {
        Lesson6NumberOfDiscIntersections l = new Lesson6NumberOfDiscIntersections();
//        System.out.println(l.solution(new int[]{1, 5, 2, 1, 4, 0}));  // 11
        System.out.println(l.solution(new int[]{1, 2147483647, 0}));    // 2
    }
}
