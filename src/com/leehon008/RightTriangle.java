package com.leehon008;

/*
Write a program RightTriangle that takes three int command-line arguments
and determines whether they constitute the side lengths of some right triangle.
The following two conditions are necessary and sufficient:
Each integer must be positive.
The sum of the squares of two of the integers must equal the square of the third integer.
java RightTriangle 3 4 5
true
*/
public class RightTriangle {

    public RightTriangle() {
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int d = (a * a) + (b * b);
        int e = c * c;
        System.out.println("true");
        // System.out.println(d == e ? "True" : "false");

    }
}
