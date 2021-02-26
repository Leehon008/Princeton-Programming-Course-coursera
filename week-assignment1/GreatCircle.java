public class GreatCircle {
    public static void main(String[] args) {
        double latRad, longRad, latRad1, longRad1;
        double a1, b1, a2, b2, c, d, distance;
        final double r = 6371.0;

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        latRad = Math.toRadians(x1);
        longRad = Math.toRadians(y1);
        latRad1 = Math.toRadians(x2);
        longRad1 = Math.toRadians(y2);

        double result = 2*r*(Math.asin(Math.pow(Math.pow((Math.sin((latRad1-latRad)/2)), 2) + (Math.cos(latRad)*Math.cos(latRad1)*(Math.pow((Math.sin((longRad1-longRad)/2)), 2))), 0.5)));

        a1 = Math.sin(latRad);
        b1 = Math.cos(latRad);
        a2 = Math.sin(latRad1);
        b2 = Math.cos(latRad1);

        c = Math.cos(longRad1 - longRad);

        d = (a1 * a2) + (b1 * b2 * c);

        distance = (r * Math.acos(d)) + 0.5;

        System.out.println(result + " " + "kilometers");
    }
}
