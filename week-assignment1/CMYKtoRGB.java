public class CMYKtoRGB {
    public static void main(String[] args) {

        double white;
        int r, g, blue;

        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);


        white = 1 - k;
        r = (int) Math.round(255 * white * (1 - c));
        g = (int) Math.round(255 * white * (1 - m));
        blue = (int) Math.round(255 * white *(1 - y));

        System.out.println("Red = " + r);
        System.out.println("Green = " + g);
        System.out.println("Blue = " + blue);

    }
}
