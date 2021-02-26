/*
Activation functions. Write a program ActivationFunction.java to compute various activation functions that arise
in neural networks. An activation function is a function that maps real numbers into a desired range,
such as between 0 and 1 or between –1 and +1.
        The Heaviside step function is given by
            H(x)=⎧⎩⎨⎪⎪0121if x<0if x=0if x>0
        The sigmoid function is given by
            σ(x)=11+e−x
        The hyperbolic tangent function is given by
            tanh(x)=ex−e−xex+e−x
        The softsign function is given by
            f(x)=x1+|x|
        The square nonlinearity function is given by
            SQNL(x)=⎧⎩⎨⎪⎪⎪⎪⎪⎪⎪⎪−1x+x24x−x241if x≤−2if −2<x<0if 0≤x<2if x≥2
        All activation functions should return NaN (not a number) if the argument is NaN.
 */
public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x)

    // Returns the sigmoid function of x.
    public static double sigmoid(double x)

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x)

    // Returns the softsign function of x.
    public static double softsign(double x)

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x)

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args)
}