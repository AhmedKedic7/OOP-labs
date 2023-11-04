package lab5.Apartment;

public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;
    public Book(String writer,String name, double weight){
        this.name=name;
        this.writer=writer;
        this.weight=weight;
    }
    @Override
    public double weight(){
        return weight;
    }
    @Override
    public String toString(){
        return writer+":"+name;
    }
}
