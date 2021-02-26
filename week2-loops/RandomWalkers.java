/**
 * Write a program RandomWalkers.java that takes two integer command-line
 * arguments r and trials. In each of trials independent experiments, simulate a
 * random walk until the random walker is at Manhattan distance r from the
 * starting point. Print the average number of steps. As r increases, we expect
 * the random walker to take more and more steps. But how many more steps? Use
 * RandomWalkers.java to formulate a hypothesis as to how the average number of
 * steps grows as a function of r.
 */

public class RandomWalkers {
    public static void main(String [] args){

        int r = Integer.parseInt(args[0]);
        int trials =  Integer.parseInt(args[1]);
        int totalSteps = 0;
        double averageSteps = 0;

        for(int i = 1 ; i <= trials ; i++){
            int x = 0;
            int y = 0;
            int distance = 0;
            int steps = 0;

            while(distance != r){
                double random = Math.random();
                if(random > 0 && random < 0.25){
                    x = x + 1;
                    steps++;
                }
                if(random > 0.25 && random < 0.50){
                    x = x - 1;
                    steps++;
                }
                if(random > 0.50 && random < 0.75){
                    y = y + 1;
                    steps++;
                }
                if(random > 0.75 && random < 1){
                    y = y - 1;
                    steps++;

                }
                distance = Math.abs(x) + Math.abs(y);
            }
            totalSteps = totalSteps + steps;
        }
        averageSteps = ((double)totalSteps / trials);
        System.out.println("average steps " + averageSteps);
    }
}
