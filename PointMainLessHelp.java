// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.
public class PointMainLessHelp {
    public static void main(String[] args) {
        // create two Point objects
        PointLess p1 = new PointLess(5, 10);
        PointLess p2 = new PointLess(7, 13);
        PointLess p3 = new PointLess(2, 2);
        
        // print each point and its distance from origin
        System.out.println("p1 is " + p1);
        System.out.println("p1 distance from origin = " + p1.distanceFromOrigin());

        System.out.println("p2 is " + p2);
        System.out.println("p2 distance from origin = " + p2.distanceFromOrigin());

        // translate each point to a new location
        p1 = p1.translate(6, 1);
        p2 = p2.translate(2, 3);

        // print the points again
        System.out.println("p1 translated is now " + p1);
        System.out.println("p2 translated is now " + p2);
        
        // print the slope
        System.out.println("slope of the two points is " + p1.slope(p2));
        
        // print the slope
        if(p3.isCollinear(p1, p2) == true){
            System.out.println("the points are collinear");
        }
        else if(p3.isCollinear(p1, p2) == false){
            System.out.println("the points are not collinear");
        }
    }
}
