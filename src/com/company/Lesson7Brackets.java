package com.company;

import java.util.Stack;

public class Lesson7Brackets {

    /*
    Detected time complexity: O(N)
     */
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (char c : S.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty() || !stack.pop().equals(c)) {
                        return 0;
                    }
                    break;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Lesson7Brackets l = new Lesson7Brackets();
        System.out.println(l.solution("{[()()]}"));
        System.out.println(l.solution("([)()]"));
        System.out.println(l.solution("VV"));
        System.out.println(l.solution("VW("));
        System.out.println(l.solution("VW)"));
        System.out.println(l.solution("()"));
        System.out.println(l.solution("("));
        System.out.println(l.solution(")"));
        System.out.println(l.solution("(("));
    }
}
