package task2;


import edu.duke.Point;
import edu.duke.Shape;

public class Main {
    public static void main(String[] args) {
//        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
//        pr.testPerimeter();

        Shape shape = new Shape();
        shape.addPoint(new Point(3,2));
        shape.addPoint(new Point(4,10));
        shape.addPoint(new Point(6,7));
        shape.addPoint(new Point(6,7));

        PerimeterAssignmentRunner perimeterAssignmentRunner = new PerimeterAssignmentRunner();
        double averageLength = perimeterAssignmentRunner.getAverageLength(shape);
        System.out.println("Average length of sides: " + averageLength);


//        Shape s = new Shape();
//        s.addPoint(new Point(3,5));
//        s.addPoint(new Point(1,6));
//        s.addPoint(new Point(2,7));
//        s.addPoint(new Point(3,8));
//        s.addPoint(new Point(3,8));
//
//        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
//
//        System.out.println(pr.getNumPoints(s));
//

//        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
//        pr.testPerimeter();
    }
}








