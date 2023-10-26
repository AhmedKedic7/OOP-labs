package lab4.People;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int salary,int age, String country) {
        super(name, address,age, country);
        this.salary = salary;
    }

    public String getSalary() {
        return Integer.toString(salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return super.toString()+"\nsalary "+ salary+" euros/month";
    }
    public static void main(String[] args) {
        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200,20,"USA");
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400,20,"Finland");
        System.out.println( pekka );
        System.out.println( esko );


        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki",20,"Finland");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );
    }

}
