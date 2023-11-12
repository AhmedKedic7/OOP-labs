package lab7;

import java.util.Arrays;
import java.util.Scanner;

public class StartMe {
    public static void main(String[] args) {
        int[] array={-3,2,3,4,7,8,12};
        printElegantly(array);
        /*Scanner reader=new Scanner(System.in);

        System.out.print("Values of the array: "+ Arrays.toString(array));
        System.out.println();

        System.out.print("Enter the searched number: ");
        String searchedValue= reader.nextLine();
        System.out.println();

        boolean result=BinarySearch.search(array,Integer.parseInt(searchedValue));
        System.out.println(result);*/
    }
    public static void printElegantly(int[] array){
        System.out.print(array[0]);
        for(int i=1;i<array.length;i++){


            System.out.print(", " + array[i]);
        }
    }
}
