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
with sample i of the new sound having the same amplitude as sample ⌊iα⌋ of the existing sound. */
public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha)

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a)

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b)

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b)

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha)

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args)
}