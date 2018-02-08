
// A Point object represents a pair of (x, y) coordinates.
// Seventh version: Immutable.
// Class invariant: x >= 0 && y >= 0.
import java.awt.*;
public class PointLess {
    private int x;
    private int y;

    // Constructs a new point at the origin, (0, 0).
    public PointLess() {
        this(0, 0);    // calls Point(int, int) constructor
    }

    // Constructs a new point with the given (x, y) location.
    // pre: x >= 0 && y >= 0
    public PointLess(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }

        this.x = x;
        this.y = y;
    }

    // Returns the distance between this Point and (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Returns whether o refers to a point with the same (x, y)
    // coordinates as this point.
    public boolean equals(Object o) {
        if (o instanceof PointLess) {
            PointLess other = (PointLess) o;
            return x == other.x && y == other.y;
        } else {  // not a Point object
            return false;
        }
    }

    // Returns the x-coordinate of this point.
    public double getX() {
        return x;
    }

    // Returns the y-coordinate of this point.
    public double getY() {
        return y;
    }

    // Returns a String representation of this point.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Shifts this point's location by the given amount.
    // pre: x + dx >= 0 && y + dy >= 0
    public PointLess translate(int dx, int dy) {
        return new PointLess(x + dx, y + dy);
    }
    public double slope(PointLess other){ 
        int slopeX = x - other.x; 
        if (x == 0) { 
            throw new IllegalArgumentException("x is 0"); 
        } 
        int slopeY = y - other.y; 
        double answer = (double)(slopeY)/(double)(slopeX); 
        return answer; 
    }
    public boolean isCollinear(PointLess first, PointLess second){ 
        if (x == y) { 
            return true; 
        } 
        double slope1 = (double)(first.y - y)/(double)(first.x - x); 
        double slope2 = (double)(second.y - y)/(double)(second.x - x); 
        double slope3 = (double)(first.y - second.y)/(double)(first.x - second.x);
        if(slope1 == slope2){ 
            return true; 
        } 
        else if(slope2 == slope3){ 
            return true; 
        } 
        else if(slope3 == slope1){ 
            return true; 
        } 
        else{ 
            return false; 
        } 
    }
    public void drawPoints(Graphics g) {
        g.fillOval(x, y, 5, 5);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.setColor(Color.WHITE);
        g.drawString("(" + x + ", " + y + ")", x + 5, y + 5);
    }
}