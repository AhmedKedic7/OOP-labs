package lab5.boxes;

public class StartME {
    public static void main(String[] args) throws Exception {
        System.out.println("MAX WEIGHT BOX: ");
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));

        System.out.println("ONE THING BOX: ");
        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));

        System.out.println("BLACK HOLE BOX: ");
        BlackHoleBox bbox = new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(bbox.isInTheBox(new Thing("Saludo")));
        System.out.println(bbox.isInTheBox(new Thing("Pirkka")));

        //UPCASTING:
        Box box1 = new MaxWeightBox(10);
        Box box2 = new OneThingBox();
        Box box3 = new BlackHoleBox();

        Thing thing1=new Thing("Kedi",110);
        Thing thing2=new Thing("Mačak",10);
        Thing thing3=new Thing("Dinama",10);

        //DOWNCASTING
        if(box1 instanceof MaxWeightBox ){
            MaxWeightBox maxWeightBox=(MaxWeightBox) box1;
            maxWeightBox.add(thing1);
        }
        if(box2 instanceof OneThingBox){
            OneThingBox oneThingBox=(OneThingBox) box2;
            oneThingBox.add(thing2);
        }
        if (box3 instanceof BlackHoleBox){
            BlackHoleBox blackHoleBox=(BlackHoleBox) box3;
            blackHoleBox.add(thing3);
        }
        System.out.println("Upcasting results:");
        System.out.println("box1 is a MaxWeightBox: " + (box1 instanceof MaxWeightBox));
        System.out.println("box2 is a OneThingBox: " + (box2 instanceof OneThingBox));
        System.out.println("box3 is a BlackHoleBox: " + (box3 instanceof BlackHoleBox));

        System.out.println("\nDowncasting results:");
        System.out.println("Thing1 added to MaxWeightBox: " + box1.isInTheBox(thing1));
        System.out.println("Thing2 added to OneThingBox: " + box2.isInTheBox(thing2));
        System.out.println("Thing1 added to BlackHoleBox: " + box3.isInTheBox(thing3));
    }
}
