package basic.selenium;

import java.util.ArrayList;

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
        call.recursion();

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

    int c=0;
    public void recursion() {
        if (c == 4) {return;   }
        c++;
        System.out.println(c);
        recursion();

    }



}
