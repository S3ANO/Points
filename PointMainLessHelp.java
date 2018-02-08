// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.
import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

public class PointMainLessHelp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DrawingPanel panel = new DrawingPanel(500, 500);
        Graphics g = panel.getGraphics();
        int inputX;
        int inputY;
        ArrayList <PointLess> points = new ArrayList();
        // create two Point objects
        System.out.println("type in x and y values for each point");
        for (int i = 0; i < 3; i++) {
            inputX = input.nextInt();
            inputY = input.nextInt();
            PointLess temp = new PointLess(inputX, inputY);
            points.add(temp);
        }
        
        // print each point and its distance from origin
        System.out.println("p1 is " + points.get(0));
        System.out.println("p1 distance from origin = " + points.get(0).distanceFromOrigin());

        System.out.println("p2 is " + points.get(1));
        System.out.println("p2 distance from origin = " + points.get(1).distanceFromOrigin());

        // translate each point to a new location
        System.out.println("type in x and y translation values for each point");
        points.set(0, points.get(0).translate(inputX = input.nextInt(), inputY = input.nextInt()));
        points.set(1, points.get(1).translate(inputX = input.nextInt(), inputY = input.nextInt()));

        // print the points again
        System.out.println("p1 translated is now " + points.get(0));
        System.out.println("p2 translated is now " + points.get(1));
        
        // print the slope
        System.out.println("slope of the two points is " + points.get(0).slope(points.get(1)));
        
        // print the slope
        if(points.get(2).isCollinear(points.get(0), points.get(1)) == true){
            System.out.println("the points are collinear");
        }
        else if(points.get(2).isCollinear(points.get(0), points.get(1)) == false){
            System.out.println("the points are not collinear");
        }
        points.get(0).drawPoints(g);
    }
}
