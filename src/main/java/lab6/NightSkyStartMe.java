package lab6;

import java.util.Random;

public class NightSkyStartMe {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSkyStartMe(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public void print() {
        Random random = new Random();

        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                if (random.nextDouble() <= this.density) {
                    System.out.print("*");
                    this.starsInLastPrint++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }

    public static void main(String[] args) {
        /* 7.
        NightSkyStartMe nightSky1 = new NightSkyStartMe(0.1, 40, 10);
        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInLastPrint());
        System.out.println();

        NightSkyStartMe nightSky2 = new NightSkyStartMe(0.2, 15, 6);
        nightSky2.print();
        System.out.println("Number of stars: " + nightSky2.starsInLastPrint());*/
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");
        NightSky = new NightSky(0.2, 15, 6);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}

