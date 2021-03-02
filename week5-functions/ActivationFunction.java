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

    public static double heaviside(double x) {
        if (x < 0) return 0.0;
        else if (x == 0) return 0.5;
        else return 1.0;

    }

    public static double sigmoid(double x) {
        return 1 / (1 + (1 / Math.exp(x)));
    }

    public static double tanh(double x) {
        if (x >= 20) {
            return 1.0;
        } else if (x <= -20) {
            return -1.0;
        }
        double t = Math.exp(x);
        return (t - (1 / t)) / (t + (1 / t));
    }

    public static double softsign(double x) {
        return x / (1 + Math.abs(x));
    }

    public static double sqnl(double x) {
        if (x <= -2) return -1.0;
        else if (x < 0) return (x + ((x * x) / 4));
        else if (x < 2) return (x - ((x * x) / 4));
        else return 1.0;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        double heave = heaviside(x);
        double sig = sigmoid(x);
        double tanh = tanh(x);
        double soft = softsign(x);
        double sqnl = sqnl(x);

        System.out.println("heaveside(" + x + ")" + " = " + heave);
        System.out.println("sigmoid(" + x + ")" + " = " + sig);
        System.out.println("tanh(" + x + ")" + " = " + tanh);
        System.out.println("softsign(" + x + ")" + " = " + soft);
        System.out.println("sqnl(" + x + ")" + " = " + sqnl);
    }
}