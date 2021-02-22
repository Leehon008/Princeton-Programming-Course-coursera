/******************************************************************************
 *  Compilation:  javac ThueMorse.java
 *  Execution:    java ThueMorse n
 *
 *  Prints the Thue-Morse sequence, which is defined as follows
 *
 *      Start with 0, and repeatedly flip all the bits and concatenate
 *      it onto the original string.
 *
 *  % java ThueMorse 0
 *  0
 *
 *  % java ThueMorse 1
 *  01
 *
 *  % c
 *  0110
 *
 *  % java ThueMorse 3
 *  01101001
 *
 *  % java ThueMorse 4
 *  0110100110010110
 *
 *  % java ThueMorse 5
 *  01101001100101101001011001101001
 *
 ******************************************************************************/

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String thue   = "0";
        String morse  = "1";

        for (int i = 1; i <= n; i++) {
            String t = thue;             // save away values
            String m = morse;
            thue  += m;
            morse += t;
        }
        System.out.println(thue);
    }

}
// Java Program to find nth
// term of Thue-Morse sequence.
//
//class GFG
//{
//    // Return the complement
//    // of the binary String.
//    static String complement(String s)
//    {
//        String comps = "";
//
//        // finding the complement
//        // of the String.
//        for (int i = 0; i < s.length(); i++)
//        {
//
//            // if character is 0,
//            // append 1
//            if (s.charAt(i) == '0')
//                comps += '1';
//
//                // if character is 1,
//                // append 0.
//            else
//                comps += '0';
//        }
//
//        return comps;
//    }
//
//    // Return the nth term
//    // of Thue-Morse sequence.
//    static String nthTerm(int n)
//    {
//        // Initialing the
//        // String to 0
//        String s = "0";
//
//        // Running the loop
//        // for n - 1 time.
//        for (int i = 1; i < n; i++)
//
//            // appending the complement of
//            // the String to the String.
//            s += complement(s);
//
//
//        return s;
//    }
//
//    // Driven Code
//    public static void main(String[] args)
//    {
//        int n = 4;
//        System.out.print(nthTerm(n));
//    }
//}
//
//// This code is contributed by
//// mits
