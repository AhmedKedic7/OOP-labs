package lab4.People;

public class Person {
    private String name;
    private String address;
    private int age;
    private String country;

    public Person(String name, String address,int age,String country) {
        this.name = name;
        this.address = address;
        this.country=country;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString(){
        return name +"\n   "+ address+"\n "+age+"\n "+country;
    }
    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa",20,"BiH");
        Person esko = new Person("Esko Ukkonen","Manneheimintie Street 15 00100 Helsiniki",20,"BiH");
        System.out.println(pekka);
        System.out.println(esko);
    }

}
