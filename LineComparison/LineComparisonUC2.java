package LineComparison;

public class LineComparisonUC2 {

    public double calcLengthOfLine(double p1, double q1, double p2, double q2) {
        double a = (p2 - p1);
        double b = (q2 - q1);
        double length = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return length;

    }

    public int compareLine(double length1, double length2) {
        int flag = 0;
        if ( length1 == length2) {
            flag = 1;
        }
        return flag;
    }


    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double p1 = Double.parseDouble(args[4]);
        double q1 = Double.parseDouble(args[5]);
        double p2 = Double.parseDouble(args[6]);
        double q2 = Double.parseDouble(args[7]);


        LineComparisonUC2 lineComparisonUC2 = new LineComparisonUC2();
        double length1 = lineComparisonUC2.calcLengthOfLine(x1,y1,x2,y2);
        double length2 = lineComparisonUC2.calcLengthOfLine(p1,q1,p2,q2);

        System.out.println("Length of the 1st line is : " + length1);
        System.out.println("Length of the 2nd line is : " + length2);

        int flag = lineComparisonUC2.compareLine(length1,length2);

        if (flag == 1)
            System.out.println("The lines are equal.");
         else
            System.out.println("The lines are not equal.");
    }
}

