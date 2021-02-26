public class RightTriangle {
    public static void main(String[] args) {

        int a2, b2, c2, d2, e2, f2;
        boolean isRightTriangle;

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        a2 = (a * a) + (b * b);
        b2 = (c * c);
        c2 = (a * a) + (c * c);
        d2 = (b * b);
        e2 = (b * b) + (c * c);
        f2 = (a * a);

        isRightTriangle = (a > 0 && b > 0 && c > 0 && a2 == b2 || c2 == d2 || e2 == f2);
        System.out.println(isRightTriangle);

    }
}
