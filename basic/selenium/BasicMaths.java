package basic.selenium;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicMaths {
    public static void main(String[] args) {
        BasicMaths call = new BasicMaths();
//        call.countDigit(3324);
//        call.reverseANumber(3324);
//        call.checkPalindrome(121);
//        call.findHCF(93459,12234);
//            call.armStrongNum(153);
//        call.getAllDivisors(36);
//        call.checkPrime(11);
//        call.recursion("Dheeraj",4);
//        call.printNumberRecursion(2,12);
//        call.printRecursion(2,12);
//        System.out.println(call.printSumRecursion(5));
//        System.out.println(call.factorialOfNum(4));
//call.log();
//        int[] ar={2,1,3,45,67,34};
//        System.out.println(Arrays.toString(ar));
//        call.reverseArray(ar,0, ar.length-1);
//        System.out.println(Arrays.toString(ar));
//        String str="accccca";
//        call.palindrome(str,0,6);
        call.printFibonacciSeries(5);
    }

    public void countDigit(int x) {
        int count = (int) (Math.log10(x) + 1);
        System.out.println(count);
    }

    public void reverseANumber(int x) {

        int count=(int)(Math.log10(x)+1);
        int y=0;
        System.out.println("Y value: "+y);
        for(int i=0;x>=1;i++){
        y=y+(x%10)*(int) Math.pow(10,count-1);
        count--;
            System.out.println("Y value: "+y);
        x=x/10;
        }
        System.out.println(y);

//        int reverseNum=0;
//        while (x>=1){
//            int id=x%10;
//            reverseNum=reverseNum*10+id;
//            x=x/10;
//        }
//        System.out.println(reverseNum);
    }

    public void checkPalindrome(int x){
      int i= (int) Math.pow(10,(int)(Math.log10(x))),j=0;
      int temp=x;
      int reverseNum=0;
        while(x>0){
            int id=x%10;
            reverseNum=reverseNum*10+id;
            x=x/10;
        }
        if(reverseNum==temp){
            System.out.println(reverseNum+" is same "+temp);
        }
    }

    public void findHCF(int x,int y){

        int hcf=1;
//        for(int i=1;i<Math.min(x,y);i++){
//            if(x%i==0 && y%i==0){
//                hcf=i;
//            }
//        }
//        System.out.println("HCF :"+hcf);
//
        while(x > 0 && y > 0) {
            if(x > y) {
                x = x % y;
            }
            else {
                y = y % x;
            }
        }
        if(x == 0) {
            System.out.println(y);
        }
        System.out.println(x);
    }

    public  void armStrongNum(int x){
        int temp=x;
        int number=String.valueOf(x).length();  //(int)(Math.log10(x)+1);
        int sum=0;
        while(x>=1){
            sum= (int) (sum+Math.pow(x%10,number));
            x=x/10;
        }
        System.out.println(sum == temp);
    }

    public void getAllDivisors(int x){

        ArrayList<Integer> divisors = new ArrayList<>();
        int count=0;
        for(int i=1;i<Math.sqrt(x);i++){
            if(x%i==0){
               divisors.add(i);
                divisors.add(x/i);
            }
        }

            System.out.println(divisors);


    }

    public void checkPrime(int x){
        for (int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }

    public void recursion(String name,int times) {
        if (times==0) {return;   }
        times--;
        System.out.println(name);
        recursion(name,times);
    }

    public void printNumberRecursion(int i,int x){
        if(i>=x){ return;    }
        System.out.println(i);
        printNumberRecursion(i+1,x);
    }

    public void printRecursion(int i,int x){
        if(i>=x){ return;    }
        System.out.println(x);
        printRecursion(i,x-1);
    }


    public int printSumRecursion(int x){
        if(x==0){
            return 0;
        }
        return x+printSumRecursion(x-1);
    }

    public int factorialOfNum(int x){

        if(x==0){return 1;}

        return x*factorialOfNum(x-1);
    }

    public void log(){

//        int x=2;
//        int y=3;
//        System.out.println(Math.log(x)+Math.log(y));
//        System.out.println(Math.log10(8000));
//        System.out.println(Math.log(8)/Math.log(2));
//        System.out.println(Math.log1p(8));
//    int[] ar ={0,-1,20,-10};
//    int largest=0;
//    for(int i=0;i<ar.length-1;i++){
//        if(ar[i]>ar[i+1]){
//            largest=ar[i];
//        }
//        else {
//            largest=ar[i+1];
//        }
//
//    }
//        System.out.println(largest);


    }

//    public void reverseArray(int[] ar, int start, int end){
//        if(start<end){
//            int temp=ar[start];
//            ar[start]=ar[end];
//            ar[end]=temp;
//            reverseArray(ar,start+1,end-1);
//        }
//    }

//    public void palindrome(String str,int start, int end){
//
//        if(start==(str.length()-1)/2){
//            System.out.println("Palindrome");
//            return;
//        }
//        if(start<=end && str.charAt(start)==str.charAt(end)){
//                 palindrome(str,start+1,end-1);
//       }
//        if(start<end && str.charAt(start)!=str.charAt(end)){
//            System.out.println("Not Palindrome");
//            return;
//        }
//    }

    public void printFibonacciSeries(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
