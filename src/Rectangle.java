public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter(){
        double perimeter =(this.length *2.0)+(this.width*2.0);
        return perimeter;
    }
    public void printDimension(){
        System.out.println("Length of this rectangle is "+this.length+ ", width of this rectangle is "+this.width+", perimeter of this rectangle is "+calculatePerimeter());
    }
}
