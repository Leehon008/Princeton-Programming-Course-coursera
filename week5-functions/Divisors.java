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

    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b)

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b)

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b)

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n)

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args)
}