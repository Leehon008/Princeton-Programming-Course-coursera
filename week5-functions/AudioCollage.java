/*
Audio collage. Create a library to manipulate digital audio and use that library to create an audio collage.
 As in lecture, we will represent sound as an array of real numbers between –1 and +1, with 44,100 samples per second.
  You will write a library of functions to produce audio effects by manipulating such arrays.
Amplify. Create a new sound that contains the same samples as an existing sound,
but with each sample multiplied by a constant α. This increases the volume when α>1 and decreases it when 0<α<1.
Reverse. Create a new sound that contains the same samples as an existing sound, but in reverse order.
This can lead to unexpected and entertaining results.
Merge/join. Create a new sound that combines two existing sounds by appending the second one after the first.
 If the two sounds have m and n samples, then the resulting sound has m + n samples.
 This enables you to play two sounds sequentially.
Mix/overlay. Create a new sound that combines two existing sounds by summing the values of the corresponding samples.
If one sound is longer than the other, append 0s to the shorter sound before summing.
 This enables you to play two sounds simultaneously.
Change speed. Create a new sound that changes the duration of an existing sound via resampling.
If the existing sound has n samples, then the new sound has ⌊n/α⌋ samples for some constant α>0,
with sample i of the new sound having the same amplitude as sample ⌊iα⌋ of the existing sound.
*/
public class AudioCollage {

    public static double[] amplify(double[] a, double alpha) {

        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * alpha;
        }

        return c;
    }

    public static double[] reverse(double[] a) {

        int n = a.length;
        double[] c = new double[n];

        for (int i = n - 1; i >= 0; i--) {
            c[n - i - 1] = a[i];
        }

        return c;
    }

    public static double[] merge(double[] a, double[] b) {
        int len = a.length + b.length;
        double[] c = new double[len];

        for (int i = 0; i < len; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[b.length + i - len];
            }
        }
        return c;
    }

    public static double[] mix(double[] a, double[] b) {

        int len = a.length > b.length ? a.length : b.length;
        double[] x = new double[len];
        double[] y = new double[len];

        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            y[i] = b[i];
        }

        double[] c = new double[len];

        for (int i = 0; i < len; i++) {
            c[i] = x[i] + y[i];
        }

        return c;
    }

    public static double[] changeSpeed(double[] a, double alpha) {
        int n = a.length;

        int m = (int) Math.floor(n / alpha);

        double[] c = new double[m];

        for (int i = 0; i < m; i++) {
            int k = (int) Math.floor(i * alpha);
            c[i] = a[k];
        }

        return c;
    }

    public static void main(String[] args) {

        double[] A = new double[44100];
        double[] B = new double[44100];

        A = StdAudio.read("beatbox.wav");
        B = StdAudio.read("chimes.wav");

        double alpha = 1.5;

        StdAudio.play(amplify(A, alpha));
        StdAudio.play(reverse((A)));
        StdAudio.play(merge(A, B));
        StdAudio.play(mix(A, B));
        StdAudio.play(changeSpeed(A, alpha));


    }
}