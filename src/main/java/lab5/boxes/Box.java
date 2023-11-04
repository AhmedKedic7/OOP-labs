package lab5.boxes;

import java.util.Collection;

public abstract class Box {
    public abstract void add(Thing thing);
    public void add(Collection<Thing> things){
        for (Thing thing: things){
            Box.this.add(thing);
        }
    }
    public abstract boolean isInTheBox(Thing thing);
}
