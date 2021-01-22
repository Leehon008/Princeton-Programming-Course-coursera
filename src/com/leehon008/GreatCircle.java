package com.leehon008;

/*
        Write a program GreatCircle.java that takes four double command-line arguments x1, y1, x2, and y2—
        the latitude and longitude (in degrees) of two points on the surface of the earth—
        and prints the great-circle distance (in kilometers) between them.
        Use the following Haversine formula
        distance= 2rarcsin(√sin2(x2−x12)+cosx1cosx2sin2(y2−y12)−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−)
        where r=6,371.0 is the mean radius of the Earth (in kilometers).
        for example
        java GreatCircle 40.35 74.65 48.87 -2.33    // Princeton to Paris
        5902.927099258561 kilometers
        Hint: The command-line arguments are given in degrees but Java’s trigonometric functions use radians.
        Use Math.toRadians() to convert from degrees to radians.
*/
public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;

        double rootAns = Math.sin(Math.sin((x2 - x1) / 2));
        double lastCos = (Math.cos(x1) * Math.cos(x2));
        double lastSine = Math.sin((y2 - y1) / 2);
        double distance = (2 * r * (Math.asin(Math.sqrt(rootAns + (lastCos * lastSine)))));

        System.out.println(distance + " " + "kilometers");

    }
}
