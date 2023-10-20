package org.example.quiz;

public class quiz {
    public static void main(String[] args) {

        printTablesNumber(3,6,2);
        System.out.println( baseRaisedPower(3,3));
        printInvertedHalfPyramid(5);
        printWordsFromSentences("Ahmed Emina Ilma BOOOOONAAAA");
        printFactors(64);
        countEvenOddZero(new int[]{1, 2,3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(isPalindrome("anavolimilovana"));
        System.out.println(isPrime(5));

        printHalfPyramid(5);
    }
    public static void printTablesNumber(int start, int end, int number){


        for(int i = start;i<=end;i++){
            System.out.println(number+"*"+i+"="+number*i);

        }
    }
    public static int baseRaisedPower(int base , int power){
        int res=1;
        for(int i=0;i<power;i++){
            res=res*base;
        }
        return res;
    }
    public static void printInvertedHalfPyramid(int rows){
        for(int i=rows;i>=1;i--){

            for (int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();


        }


    }
    public static void countEvenOddZero(int[] numbers){
        int even=0;
        int odd=0;
        int zero=0;
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==0){
                zero++;
            }
            else if(numbers[i]%2==0){
                even++;
            }
            else{
                odd++;
            }


        }
        System.out.println("Number of zeros is:"+ zero);
        System.out.println("Number of even numbers is: "+ even);
        System.out.println("Number of odd numbers is: "+ odd);
    }
    public static void printWordsFromSentences(String sentence){
        String[] s = sentence.split(" ");
        for (String w: s){
            System.out.println(w);
        }

    }
    public static boolean isPalindrome(String s){
        int left=0;int right=s.length()-1;
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    public static boolean isIsogram(String str1){
        int l1=0;int r=str1.length()-1;
        while(l1<r){
            if(str1.charAt(l1)==str1.charAt(r)){
                return false;
            }
            l1++;
            r--;

        }
        return true;
    }
    public static void printHalfPyramid(int rows){
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();

            }

    }
    public static void printFactors(int numbers){
        for(int i=1;i<=numbers;i++){
            if(numbers%i==0){
                System.out.println(i);
            }
        }
    }

}

