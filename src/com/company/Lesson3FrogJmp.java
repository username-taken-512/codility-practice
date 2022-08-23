package com.company;

public class Lesson3FrogJmp {
     /*
    Time spent: ~20 min
    Detected time complexity: O(1)
     */

    public int solution2(int X, int Y, int D) {
        double jumps = (double) (Y - X) / D;
        return (int) Math.ceil(jumps);
    }

    public int solution(int X, int Y, int D) {
        // Poor solution. Tests correct, poor performance.
        int current = X, jumps = 0;

        while (current < Y) {
            current += D;
            jumps++;
        }
        return jumps;
    }

    public static void main(String[] args) {
        Lesson3FrogJmp l = new Lesson3FrogJmp();
        System.out.println(l.solution2(10, 85, 30));
        System.out.println(l.solution2(10, 100, 30));
    }
}
