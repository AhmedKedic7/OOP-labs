package lab5.boxes;

import lab5.Apartment.ToBeStored;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private ArrayList<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<>();
    }
    @Override
    public void add(Thing thing){

        if(this.weightOfItems()+thing.getWeight() <= this.maxWeight) {
            things.add(thing);
        }
    }
    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
    private double weightOfItems(){
        double weight=0;
        for(Thing thing : things){
            weight=weight+thing.getWeight();
        }
        return weight;
    }
}
