package basic.selenium;

public class BasicMaths {
    public static void main(String[] args) {
        BasicMaths call = new BasicMaths();
//        call.countDigit(3324);
        call.reverseANumber(3324);

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

}
