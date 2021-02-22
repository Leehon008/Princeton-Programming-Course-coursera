
/******************************************************************************
 *  Compilation:  javac DiscreteDistribution.java
 *  Execution:    java DiscreteDistribution freq0 freq1 freq2 ...
 *
 *  Reads in an array of n frequency counts from the command line,
 *  and prints out i with probability proportional to the ith
 *  frequency count.
 *
 *  // six equally likely events
 *  % java DiscreteDistribution 1 1 1 1 1 1
 *  3
 *
 *  % java DiscreteDistribution 1 1 1 1 1 1
 *  0
 *
 *  // six events, one 3x more likely than the others
 *  % java DiscreteDistribution 1 1 1 1 1 3
 *  5
 *
 *  % java DiscreteDistribution 1 1 1 1 1 3
 *  2
 *
 *  % java DiscreteDistribution 1 1 1 1 1 3
 *  5
 *
 ******************************************************************************/

public class DiscreteDistribution {
    public static void main(String[] args) {

        // read in frequency of occurrence of n values
        int n = args.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            freq[i] = Integer.parseInt(args[i]);
        }

        // compute total count of all frequencies
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += freq[i];
        }

        // generate random integer with probability proportional to frequency
        int r = (int) (total * Math.random());   // integer in [0, total)
        int sum = 0;
        int event = -1;
        for (int i = 0; i < n && sum <= r; i++) {
            sum += freq[i];
            event = i;
        }
//// Produce a sequence.
//        List<Integer> allIndices = new ArrayList<>();
//        for (int i = 0; i < freq.length; i += 1) allIndices.add(i);
//
//// Shuffle the sequence in place.
//        Collection.shuffle(allIndices);
//
//// Take a sublist of m elements, and use it.
//        List<Integer> indices = allIndices.subList(0, m - 1);
//        for (Integer ix : indices) {
//            // Here ix will be a unique random index into freq, use it.
//        }
        System.out.println(event);
    }
}