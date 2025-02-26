package entities;

public class Rectangle {
    double area;
    public double width;
    public double height;
    double perimeter;
    double diagonal;

    public double calculateArea(){
        return area = width * height;
    };

    public double calculatePerimeter(){
        return perimeter = width*2 + height*2;
    }
    public double calculateDiagonal(){
        return diagonal = Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
    }

    @Override
    public String toString() {
        return String.format(
                "AREA: %.2f m²\nPERIMETER: %.2f m\nDIAGONAL: %.2f m",
                area, perimeter, diagonal);
    }
}
