package lab5.Apartment;

public class StartME {
    public static void main(String[] args) {
        Book book1=new Book("Fedor Dostojevski ","Crime and Punishment",2);
        Book book2=new Book("Robert Martin ","Clean Code",1);
        Book book3=new Book("Kent Beck ","Test Driven Development",0.5);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        CD cd1=new CD("Pink Floyd","Dark Side Of the Moon",1973);
        CD cd2=new CD("Wigwam","Nuclear Nightclub",1975);
        CD cd3=new CD("Rendezvous Park","Closer to Being Here",2012);

        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        Box box=new Box(10);
        box.add(book1);
        box.add(book2);
        box.add(book3);
        box.add(cd1);
        box.add(cd2);
        box.add(cd3);
        System.out.println(box);

    }
}
