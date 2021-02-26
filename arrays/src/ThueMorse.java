/******************************************************************************
 *  Compilation:  javac ThueMorse.java
 *  Execution:    java ThueMorse n
 *
 *  Prints the Thue-Morse sequence, which is defined as follows
 *
 *      Start with +, and repeatedly flip all the bits and concatenate
 *      it onto the original string.
 *
 *
 *  Thue–Morse weave. Write a program ThueMorse.java that takes an integer command-line argument n and
 *  prints an n-by-n pattern like the ones below.
 *  Include two space characters between each + and - character.
 *
 ******************************************************************************/

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String thue = "+";
        String morse = "-";

        for (int i = 1; i <= n; i++) {
            String t = thue;             // save away values
            String m = morse;
            thue += m;
            morse += t;
        }
        System.out.println(thue);
        System.out.println();
    }

}