/**
 * Write a program RandomWalker.java that takes an integer command-line argument
 * r and simulates the motion of a random walk until the random walker is at
 * Manhattan distance r from the starting point. Print the coordinates at each
 * step of the walk (including the starting and ending points), treating the
 * starting point as (0, 0). Also, print the total number of steps taken.
 */

public class RandomWalker {

    public static void main(String args[]) {

        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int step = 0;
        double R;

        while(Math.abs(x) + Math.abs(y) < r ){
            step++;
            R = Math.random();
            if(R <= 0.25) x++;
            else if (R <= 0.50) x--;
            else if (R <= 0.75) y++;
            else if (R <= 1.00) y--;

            System.out.println("(" + x + ", " + y + ")" );
        }
        System.out.println("steps = " + step);
    }
}
