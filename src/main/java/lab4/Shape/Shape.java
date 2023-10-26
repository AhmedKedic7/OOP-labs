package lab4.Shape;

public class Shape {
    private String color;
    static final double pi=3.14;
    private FillType fillType;
    public Shape(String color, FillType fillType){
        this.color=color;
        this.fillType=fillType;
    }
    public void displayInfo(){
        System.out.println(color);
        System.out.println(fillType);
    }
    public double getArea(){
        return 0;
    }

}
