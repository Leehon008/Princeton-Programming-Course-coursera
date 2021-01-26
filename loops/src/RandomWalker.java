/**
 * Write a program RandomWalker.java that takes an integer command-line argument
 * r and simulates the motion of a random walk until the random walker is at
 * Manhattan distance r from the starting point. Print the coordinates at each
 * step of the walk (including the starting and ending points), treating the
 * starting point as (0, 0). Also, print the total number of steps taken.
 */

public class RandomWalker {

    public static void main(String[] args) {

        int steps = Integer.parseInt(args[0]);
        int X_axis = 0;
        int Y_axis = 0;
        int r = 0;

        for (int i = 0; i < steps; i++) {
            double rand = Math.random();
            if (rand < 0.25)
                X_axis++;
            else if (rand < 0.50)
                Y_axis--;
            else if (rand < 0.75)
                X_axis--;
            else if (rand < 1.0)
                Y_axis++;
            System.out.println("(" + X_axis + ", " + Y_axis + ")");
        }

        r = Math.abs(X_axis) + Math.abs(Y_axis);
        System.out.println("Steps = " + r);
    }
}
