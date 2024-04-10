public class AreaShape {
    // Calculate area of a circle
    public double area(double radius){
        return Math.round(Math.PI*radius*radius);
    }

    // Calculate area of a rectangle
    public double area(double length, double breadth) {
        return length * breadth;
    }
    // Calculate area of a square
    public double area(double side, boolean isSquare ) {
        return side * side;
    }

    public static void main(String[] args) {
        AreaShape sh = new AreaShape();
        System.out.println("Area of rectangle is " + sh.area(2,4));
        System.out.println("Area of circle is " +sh.area(2));
        System.out.println("Area of square is " +sh.area(2,true));

    }
}
