package Default;

import lab4.People.Person;
import lab4.People.Student;
import lab4.People.Teacher;
import lab4.Shape.FillType;
import lab4.Shape.Circle;
import lab4.Shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void printDepartment(List<Person> people) {
        for (Person person:people) {
            System.out.println(person);

        }

    }
    public static void main(String[] args) {
        Circle circle= new Circle("Red",FillType.FILLED,20);
        System.out.println("Area is: "+circle.getArea() + "cm^2");
        circle.displayInfo();
        System.out.println("Circumference: "+circle.calculateCircumference(3.14,20)+ "cm");
        System.out.println("Circumference with constant: "+circle.calculateCircumference(25)+ "cm");

        Rectangle rectangle = new Rectangle("Blue",FillType.NOT_FILLED,25,10);
        System.out.println("Area is: "+rectangle.getArea() + "cm^2");
        rectangle.displayInfo();


    }


}