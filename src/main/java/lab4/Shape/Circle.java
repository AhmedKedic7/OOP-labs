package lab4.Shape;

public class Circle extends Shape {
    private double radius;


    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(radius+ "cm");

    }
    @Override
    public double getArea(){

        return pi*radius*radius;
    }
    public double calculateCircumference(double PI,double r ){
        return 2*PI*r;
    }
    public double calculateCircumference(double r ){
        return 2*pi*r;
    }
}
