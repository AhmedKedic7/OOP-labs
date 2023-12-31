package lab5.boxes;

import java.util.Objects;

public class Thing {
    private double weight;
    private String name;
    public Thing(String name, double weight) throws Exception{
        if (weight<0){
            throw new IllegalArgumentException("The weight cannot be negative ");

        }
        this.name=name;
        this.weight=weight;
    }

    public Thing(String name) {
        this.name=name;
        this.weight=0;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    //equals and hashCode is generated by Code Generate by IDE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
