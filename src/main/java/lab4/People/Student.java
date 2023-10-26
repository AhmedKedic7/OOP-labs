package lab4.People;

public class Student extends Person {
    private int credits;
    private boolean study;

    public Student(String name, String address,int age, String country) {
        super(name, address, age, country);
        this.credits = 0;
    }
    public int credits() {
        return credits;
    }
    public void study() {
        credits += 1;
    }

    @Override
    public String toString(){
        return super.toString();
    }

    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki",20,"Finland");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());
    }

}

