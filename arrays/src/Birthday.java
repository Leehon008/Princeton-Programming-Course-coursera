/**
 * Write a program Birthday.java that takes two integer command-line arguments n and trials
 * and performs the following experiment, trials times:
 * Choose a birthday for the next person, uniformly at random between 0 and n−1.
 * Have that person enter the room.
 * If that person shares a birthday with someone else in the room, stop; otherwise repeat.
 **/

public class Birthday {

    public static void main(String[] args) {

        int days = Integer.parseInt(args[0]);  // days of the people
        int trails = Integer.parseInt(args[1]);
        int[] counter = new int[days + 2];
        double fraction = 0.0;
        int k = 1;
        counter[0] = 0;

        System.out.println(1 + " " + 0 + " " + fraction); // initial experiment

        while (fraction < 0.5) {

            counter[k] = 0;
            for (int i = 0; i < trails; i++) {
                boolean[] hasBirthday = new boolean[days];
                int people = 0;

                while (true) {
                    people++;                               // one more person enters the room
                    int day = (int) (days * Math.random());   // integer between 0 and days-1
                    if (hasBirthday[day]) break;              // found two people with the same birthday
                    hasBirthday[day] = true;                  // update array
                }

                if (people == k + 1) {
                    counter[k]++;
                }
            }
            fraction = fraction + (double) counter[k] / trails;
            System.out.println(k + 1 + "\t" + counter[k] + "\t" + fraction);
            k++;

        }

    }
}