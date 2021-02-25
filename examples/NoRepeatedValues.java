/* *****************************************************************************
 * Description:  Write a program Squish that reads in a sequence of integers
 *                from standard input and prints out the integers, but removing
 *                repeated values that appear consecutively. For example,
 *                if the input is
 *                    1 2 2 1 5 1 1 7 7 7 7 1 1 1 1 1 1 1 1 1
 *                your program prints
 *                    1 2 1 5 1 7 1
 *                For simplicity, don't add a space or newline at the end. You
 *                may assume there is at least one input.
 *
 *
 **************************************************************************** */

public class Squish {
    public static void main(String[] args) {
        // get first value and print
        int value = StdIn.readInt();
        StdOut.print(value);

        // read in remaining values
        while (!StdIn.isEmpty()) {
            int next = StdIn.readInt();
            // only print if different
            if (value != next) {
                value = next;
                System.out.print(" " + value);
            }
        }
    }
}