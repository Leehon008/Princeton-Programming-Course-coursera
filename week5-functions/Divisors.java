/*
Greatest common divisors. Write a program Divisors.java to compute the greatest common divisor and related functions on integers:
The greatest common divisor (gcd) of two integers a and b is the largest positive integer that is a divisor of both a and b.
 For example, gcd(1440, 408) = 24 because 24 is a divisor of both 1440 and 408 (1440=24⋅60,408=24⋅17) but no larger
 integer is a divisor of both. By convention, gcd(0,0)=0.
The least common multiple (lcm) of two integers a and b is the smallest positive integer that is a multiple
of both a and b. For example, lcm(56, 96) = 672 because 672 is a multiple of both 56 and 96 (672=56⋅12=96⋅7)
but no smaller positive number is a multiple of both. By convention, if either a or b is 0, then lcm(a,b)=0.
Two integers are relatively prime if they share no positive common divisors (other than 1). For example,
221 and 384 are not relatively prime because 17 is a common divisor.
Euler’s totient function ϕ(n) is the number of integers between 1 and n that are relatively prime with n.
 For example, ϕ(9)=6 because the six numbers 1, 2, 4, 5, 7, and 8 are relatively prime with 9.
 Note that if n≤0, then ϕ(n)=0.
*/
public class Divisors {

    public static int gcd(int a, int b) {

        if (a == 0 && b == 0) return 0;
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);

        while (b1 != 0) {
            int t = b1;
            b1 = a1 % b1;
            a1 = t;
        }
        return a1;
    }

    public static int lcm(int a, int b) {

        if (a == 0 || b == 0) return 0;
        int x = Math.abs(a);
        int y = Math.abs(b);
        int lc = (x * y) / gcd(x, y);

        return lc;
    }

    public static boolean areRelativelyPrime(int a, int b) {
        if (gcd(a, b) == 1) {
            return true;
        } else return false;
    }

    public static int totient(int n) {
        if (n <= 0) return 0;
        else {
            int count = 0;
            for (int i = 1; i < n; i++) {
                if (areRelativelyPrime(i, n)) {
                    count++;
                }
            }
            return count;
        }

    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int gc = gcd(a, b);
        int lc = lcm(a, b);
        boolean RP = areRelativelyPrime(a, b);
        int eul_a = totient(a);
        int eul_b = totient(b);

        System.out.println("gcd(" + a + "," + " " + b + ")" + " = " + gc);
        System.out.println("lcm(" + a + "," + " " + b + ")" + " = " + lc);
        System.out.println("areRelativelyPrime(" + a + "," + " " + b + ")" + " = " + RP);
        System.out.println("totient(" + a + ")" + " = " + eul_a);
        System.out.println("totient(" + b + ")" + " = " + eul_b);

    }
}