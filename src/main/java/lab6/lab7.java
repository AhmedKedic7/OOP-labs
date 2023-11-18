package lab6;

class lab7{
    /* 1
    public static int smallest(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
    */
    /*2.public static int indexOfTheSmallest(int[]array) {
        int smallest = array[0];
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }

        }
        return smallestIndex;
    }*/
   /*3- public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[0];
        int smallestIndex = 0;

        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }

        }
        return smallestIndex;
    }
    */
    /* 4.
    public static void swap(int[] array,int index1, int index2){

        int temp=index1;
        array[index1]=array[index2];
        array[index2]=temp;
    }*/



    public static void main(String[] args) {
        int[] array={6,7654,3324,2,6543,6,54,3,10};
        //System.out.println(Arrays.toString(array));
        //System.out.println(smallest(array));
        //System.out.println(indexOfTheSmallest(array));
        /* System.out.println(indexOfTheSmallestStartingFrom(array,4));
        System.out.println(indexOfTheSmallestStartingFrom(array,1));*/
        //swap(array,1,7);
        //System.out.println(Arrays.toString(array));

    }
}
