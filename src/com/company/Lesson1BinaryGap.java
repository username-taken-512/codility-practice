package com.company;

public class Lesson1BinaryGap {
    public int solution2(int N) {
        int n = N, highest = 0, current = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                current++;
            } else {
                current = 0;
            }
            n = n / 2;

            if (current > highest) {
                highest = current;
            }
        }

        return highest;
    }

    public int solution(int N) {
        int n = N, highest = 0, current = 0;

        // Skip "leading" zeroes
        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n > 0) {
            int m = n % 2;

            // 1: Current gap ends. Store if largest gap yet
            // 0: Current gap continues
            if (m == 1) {
                if (current > highest) {
                    highest = current;
                }
                current = 0;
            } else {
                current++;
            }

            n = n / 2;
        }

        return highest;
    }

    public static void main(String[] args) {
        Lesson1BinaryGap l = new Lesson1BinaryGap();
//        System.out.println(l.solution(555998));
        System.out.println(l.solution(32));
        System.out.println(l.solution(5));

        /*
        9   1001    -> 2
        529 1000010001  -> 4
         */
    }
}
