package lab7;

import java.util.ArrayList;
import java.util.Collections;

public class GenericStartMe {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            arr.add(i);
        }

        System.out.println(sumOfEvenOdd(arr));

        ArrayList<Double> doubleNums = new ArrayList<>();
        doubleNums.add(1.5);
        doubleNums.add(3.14);
        doubleNums.add(2.81);
        doubleNums.add(5.0);
        reverseList(doubleNums);
        System.out.println(doubleNums);

        ArrayList<Integer> intNums = new ArrayList<>();
        intNums.add(1);
        intNums.add(3);
        intNums.add(2);
        intNums.add(5);
        reverseList(intNums);
        System.out.println(intNums);

    }

    public static <T> ArrayList<T> sumOfEvenOdd(ArrayList<T> numbers) {
        ArrayList<Integer> sum = new ArrayList<>();

        int even = 0;
        int odd = 0;

        for(T i : numbers) {
            if( (int)i % 2 == 0) {
                even += (int)i;
            } else {
                odd += (int)i;
            }
        }

        sum.add(even);
        sum.add(odd);
        return (ArrayList<T>) sum;
    }

    public static <T> void reverseList(ArrayList<T> arr) {
        Collections.reverse(arr);
    }
}
