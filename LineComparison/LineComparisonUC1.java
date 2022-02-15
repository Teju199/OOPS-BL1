package LineComparison;

public class LineComparisonUC1 {
    double x1;
    double y1;
    double x2;
    double y2;

    public LineComparisonUC1(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public double calcLengthOfLine(){
        double a = (x1 - x2);
        double b = (y2 - y2);
        double length1 = Math.sqrt(Math.pow(a,2) - Math.pow(b,2));
        return length1;

    }

    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);


        LineComparisonUC1 lineComparisonUC1 = new LineComparisonUC1(x1, y1, x2, y2);

        double length1 = lineComparisonUC1.calcLengthOfLine();

        System.out.println("Length of the line is : " + length1);
    }
}
