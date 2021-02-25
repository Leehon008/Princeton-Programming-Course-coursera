/******************************************************************************
 *  Compilation:  javac PlotFilter.java
 *  Execution:    java PlotFilter < input.txt
 *  Dependencies: StdDraw.java StdIn.java
 *
 *  % java PlotFilter < USA.txt
 *
 *  Data files: https://introcs.cs.princeton.edu/java/15inout/USA.txt
 *
 ******************************************************************************/

public class PlotFilter {
    public static void main(String[] args) {
        // read in bounding box and rescale
        double xmin = StdIn.readDouble();
        double ymin = StdIn.readDouble();
        double xmax = StdIn.readDouble();
        double ymax = StdIn.readDouble();

        StdDraw.setXScale(xmin, xmax);
        StdDraw.setYScale(xmin, xmax);

        // for bigger points
        StdDraw.setPenRadius(0.005);
        // plot points, one at a time
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);
        }
        //display all points now
        StdDraw.show();
    }
}