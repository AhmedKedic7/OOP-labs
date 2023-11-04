package lab5.Apartment;

import java.util.ArrayList;
import java.util.List;

public class Box implements ToBeStored{
    private double maxWeight;
    List<ToBeStored> items;
    public Box(double maxWeight){
        this.maxWeight=maxWeight;
        this.items=new ArrayList<>();
    }
    public void add(ToBeStored item){
        if(weight()+item.weight()<=maxWeight){
            items.add(item);
        }
    }
    @Override
    public double weight(){
        double totalWeight = 0;
        for(ToBeStored item :items){
            totalWeight+=item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }


}
