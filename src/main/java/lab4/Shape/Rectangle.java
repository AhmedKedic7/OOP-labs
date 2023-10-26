package lab4.Shape;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(String color, FillType fillType, double height, double width) {
        super(color, fillType);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(width+ "cm");
        System.out.println(height+ "cm");
    }
    @Override
    public double getArea(){
        return height*width;
    }
}
