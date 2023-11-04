package PRACTICE;

public class quiz2 {
    public static void main(String[] args) {
       /* Animal animal= new Animal("ruzdo",Color.BLACK,52);
        Lion lion = new Lion(21,22);
        Tiger tiger=new Tiger(2,"ahmo",Color.WHITE,55);
        System.out.println(animal.runSound());
        System.out.println(lion.runSound());
        System.out.println(tiger.runSound());*/

    }
}/*
enum Color {
    BLACK,WHITE,RED,GREEN
}
class Animal {
    private String name;
    private int age;
    private Color color;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal(String name, Color color, int age) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public String runSound() {
        return "Animal running";
    }
}
    class Tiger extends Animal{
        private int numOfTeeth;
        public void setNumOfTeeth(int numOfTeeth){
            this.numOfTeeth=numOfTeeth;

        }
        public int getNumOfTeeth(){
            return numOfTeeth;
        }
        public Tiger(int numOfTeeth,String name,Color color,int age){
            super(name,color,age);
            this.numOfTeeth=numOfTeeth;
        }
        @Override
        public String runSound(){
            return "Tiger running";
        }
    }
    class Lion extends Animal{
        private int bearLength;
        public void setBearLength(){
            this.bearLength=bearLength;

        }
        public int getBearLength(){
            return bearLength;
        }
        public Lion(int bearLength,int age){
            super(age);
            this.bearLength=bearLength;
        }
        @Override
        public String runSound(){
            return "Lion running";
        }*/
enum Vcolor {
    YELLOW,PURPLE,
}
enum FuelType{
    DIESEL,PETROL
}
class Vehicle{
    private int numOfGears;
    private int numOfWheels;
    private Vcolor vcolor;
    public int getNumOfGears(){
        return numOfGears;
    }
    public void setNumOfGears(int numOfGears){
        this.numOfGears=numOfGears;

    }
    public int getNumOfWheels(){
        return numOfWheels;

    }
    public Vcolor getVcolor(){
        return vcolor;

    }
    public Vehicle(int numOfGears){
        this.numOfGears=numOfGears;

    }
    public Vehicle(int numOfGears,int numOfWheels, Vcolor vcolor){
        this.numOfGears=numOfGears;
        this.numOfWheels=numOfWheels;
        this.vcolor=vcolor;
    }
    public String whichComponentAmI(){
        return "I am a bicycle";

    }

    }
    class Car extends Vehicle{
        private FuelType fuelType;
        public FuelType getFuelType(){
            return fuelType;
        }
        public Car(FuelType fuelType,int numOfGears,int numOfWheels, Vcolor vcolor){
            super(numOfGears,numOfWheels,vcolor);
            this.fuelType=fuelType;
        }
        @Override
        public String whichComponentAmI(){
            return "I am a car";
        }
    }



