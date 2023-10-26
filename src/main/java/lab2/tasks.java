package lab2;

import java.util.Random;
import java.util.Scanner;


/*lab2
public class tasks {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String password = "carrot";
        String password1;
        while(true){
        System.out.println("Type the password: ");
        password1= reader.nextLine();

            if(password1.equals(password)){
                System.out.println("Right");
                System.out.println("The secret is: jryy qbar!");
                break;
            }
            else{
                System.out.println("wrong");

            }
        }
    }
}
//2
public class tasks {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Type the first number: ");
        read=reader.nextInt();
        sum+=read;
        System.out.println("Type the second number: ");
        read=reader.nextInt();
        sum+=read;
        System.out.println("Type the third number: ");
        read=reader.nextInt();
        sum+=read;

        System.out.println("Sum: " +sum);



    }
}
public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter a number: ");
            int read = reader.nextInt();
            if(read==0){
                break;
            }
            else{
                sum+=read;
                System.out.println("Sum now: " + sum);
            }
        }
        System.out.println("Sum in the end: " + sum);
    }
}
//4
public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber= reader.nextInt();
        System.out.println("Enter second number: ");
        int lastNumber= reader.nextInt();
        System.out.println("First: "+ firstNumber);
        System.out.println("Last: "+ lastNumber);
        int i=firstNumber;
        while(i<=lastNumber){
            System.out.println(i);
            i++;
        }

    }
}
//5.
public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Type a number: ");
        int number= reader.nextInt();
        int sum=0;
        for(int i=0;i<=number;i++){
            int result = (int)Math.pow(2,i);
            sum+=result;

        }
        System.out.println("The result is: " + sum);
    }
}
//6.
public class Main {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.println("How many times the text should be printed: ");
        int numberOfTimes = reader.nextInt();
        int i = 0;
        while(i<numberOfTimes){
            printText();
            i++;
        }

    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
    }
}

//7
public class Main {
    public static void main(String[] args) {
        printStars(5);
        printStars(2);
        printStars(3);

    }
    private static void printStars(int amount){
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

//8/9

public class Main {
    public static void main(String[] args) {
        drawStarsPyramid(5);
        drawStarsPyramid(10);
        drawStarsPyramidWithNumbers(4);

    }
    private static void drawStarsPyramid(int amount){
        for (int i=0;i<amount;i++){
            for (int j=0;j<=i;j++){  //for inverted pyramid we just invert this inner function like this: for (int j=amount;j>=i;j--)
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawStarsPyramidWithNumbers(int amount){
        for (int i=0;i<amount;i++){
            for (int j=0;j<=i;j++){
                System.out.print((j+1)); //for the other output we change the parameter like this: System.out.print((i+1));
           }
            System.out.println();
       }
   }
}*/
    //10
     public class tasks {
        public static void main(String[] args) {
            Random random = new Random();
            int minRange = 0;
            int maxRange = 100;
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int number;
            int counter = 0;
            do {
                System.out.println("Guess a number: ");
                Scanner reader = new Scanner(System.in);
                number = reader.nextInt();
                counter++;
                if (number < randomNumber) {
                    System.out.println("The number is greater, guesses made: "+ counter);
                } else if (number > randomNumber) {
                    System.out.println("The number is lesser,guesses made: " + counter);
                } else {
                    System.out.println("Congratulations, your guess is correct!");
                }
            } while (number != randomNumber);

        }



    }



