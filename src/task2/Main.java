package task2;


import edu.duke.Point;
import edu.duke.Shape;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.addPoint(new Point(3,5));
        s.addPoint(new Point(1,6));
        s.addPoint(new Point(2,7));
        s.addPoint(new Point(3,8));
        s.addPoint(new Point(3,8));

        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();

        System.out.println(pr.getNumPoints(s));

//        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
//        pr.testPerimeter();
    }
}








