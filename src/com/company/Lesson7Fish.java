package com.company;

import java.util.Stack;

public class Lesson7Fish {

    /*
    Detected time complexity: O(N)
     */

    public int solution(int[] A, int[] B) {
        Stack<Integer> downStack = new Stack<>();
        int fishEaten = 0;


        for (int i = 0; i < A.length; i++) {
            if (downStack.isEmpty() && B[i] == 0) {
                continue;
            }

            if (B[i] == 1) {
                downStack.push(A[i]);
            } else {
                while (!downStack.isEmpty()) {
                    fishEaten++;
                    if (A[i] > downStack.peek()) {
                        downStack.pop();
                    } else {
                        break;
                    }
                }
            }
        }

        return A.length - fishEaten;
    }

    public static void main(String[] args) {
        Lesson7Fish l = new Lesson7Fish();
//        int[] A = new int[]{4, 3, 2, 1, 5}; // 2
//        int[] B = new int[]{0, 1, 0, 0, 0};

        int[] A = new int[]{4, 3, 2, 1, 6, 5};
        int[] B = new int[]{1, 0, 1, 1, 0, 1};
        System.out.println(l.solution(A, B));
    }
}
