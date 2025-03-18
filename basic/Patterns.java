package basic;

public class Patterns {

    public static void main(String[] args){
        int rows=4;
        int cols=4;
        int counter=1;
        String str="ABCDE";
//*****
//*****
//*****
//*****
//*****

//        for (int i=0;i<=rows;i++){
//            for(int j=0;j<=cols;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//*
//**
//***
//****
//*****
//        for (int i=0;i<=rows;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//1
//22
//333
//4444

//        for (int i=1;i<=rows;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//1
//12
//123
//1234

//        for (int i=1;i<=rows;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//****
//***
//**
//*

//        for (int i=1;i<=rows;i++){
//            for(int j=cols;j>=i;j--){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

//1234
//123
//12
//1

//        for (int i=rows;i>=0;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//    *
//   ***
//  *****
// *******

//int s=0;
//        for (int i=1;i<=rows;i++){
//            for(int j=i;j<=cols;j++){
//                System.out.print(' ');
//            }
//            s++;
//            for(int x=1;x<=s;x++){
//                System.out.print('*');
//            }
//            for(int x=2;x<=s;x++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

// *******
//  *****
//   ***
//    *
//        int s=rows;
//        for (int i=1;i<=rows;i++){
//
//            for(int x=1;x<=i;x++){
//                System.out.print(' ');
//            }
//            s--;
//            for(int j=1;j<=s;j++){
//                System.out.print('*');
//            }
//            for(int j=0;j<=s;j++){
//                System.out.print('*');
//            }
//
//            for(int x=2;x<=i;x++){
//                System.out.print(' ');
//            }
//            System.out.println();
//        }

//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

//        for(int i=1;i<=rows;i++){
//            for(int j=i;j<=cols;j++){
//                System.out.print(' ');
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print('*');
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print('*');
//            }
//            for(int j=i;j<=cols;j++){
//               System.out.print(' ');
//            }
//            System.out.println();
//        }
//
//        for (int i=1;i<=rows;i++){
//            for(int x=1;x<=i;x++){
//                System.out.print(' ');
//            }
//            for(int j=i;j<=cols;j++){
//                System.out.print('*');
//            }
//            for(int j=i+1;j<=cols;j++){
//                System.out.print('*');
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(' ');
//            }
//            System.out.println();
//        }


//*
//**
//***
//****
//***
//**
//*
//        for(int i=1;i<=rows;i++){
//            for(int j=2;j<=i;j++){
//                System.out.print('*');
//            }
//            for(int j=i;j<=cols;j++){
//                System.out.print(' ');
//            }
//            System.out.println();
//        }
//
//        for (int i=1;i<=rows;i++){
//            for(int j=i;j<=cols;j++){
//                System.out.print('*');
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(' ');
//            }
//            System.out.println();
//        }
//1
//01
//101
//0101
//        int x=1;
//            for(int j=0;j<=rows;j++){
//                if(j%2==0){
//                    x=0;
//                }else {
//                    x=1;
//                }
//                for(int i=1;i<=j;i++){
//                    System.out.print(x);
//                    x=1-x;
//                }
//                System.out.println();
//            }


//1       1
//12     21
//123   321
//1234 4321

//            for(int j=0;j<=rows;j++){
//
//                for(int i=1;i<=j;i++){
//                    System.out.print(i);
//                }
//                for(int i=j;i<=cols;i++){
//                    System.out.print(' ');
//                }
//                for(int i=j+1;i<=cols;i++){
//                    System.out.print(' ');
//                }
//                for(int i=1,x=j;i<=j;i++,x--){
//                    System.out.print(x);
//                }
//                System.out.println();
//            }
//1
//2 3
//4 5 6
//7 8 9 10

//        for(int j=0;j<rows;j++){
//
//                for(int i=0;i<j;i++,counter++){
//                    System.out.print(counter);
//                    System.out.print(' ');
//                }
//                for(int i=j;i<cols;i++){
//                    System.out.print(' ');
//                }
//
//                System.out.println();
//            }

//A
//AB
//ABC
//ABCD
//ABCDE

//        for(int j=0;j<rows;j++){
//            for(int i=0;i<j;i++){
//                System.out.print(str.charAt(i));
//            }
//            for(int i=j;i<cols;i++){
//                System.out.print(' ');
//            }
//
//            System.out.println();
//        }
//ABCD
//ABC
//AB
//A
//        for(int j=0;j<rows;j++){
//
//            for(int i=0;i<cols-j;i++){
//                System.out.print(str.charAt(i));
//            }
//            for(int i=0;i<j;i++){
//                System.out.print(' ');
//            }
//
//            System.out.println();
//        }

//A
//BB
//CCC
//DDDD
//        for(int j=0;j<rows;j++){
//            for(int i=0;i<=j;i++){
//                System.out.print(str.charAt(j));
//            }
//            for(int i=j;i<cols;i++){
//                System.out.print(' ');
//            }
//            System.out.println();
//        }

//     A
//    ABA
//   ABCBA
//  ABCDCBA

//        for(int j=0;j<rows;j++){
//            for(int i=j;i<=cols;i++){
//                System.out.print(' ');
//            }
//            for(int i=0;i<j;i++){
//                System.out.print(str.charAt(i));
//            }
//            for(int i=0,x=j;i<=j;i++,x--){
//                System.out.print(str.charAt(x));
//            }
//            System.out.println();
//        }

        for(int j=0;j<rows;j++){
            for(int i=0,x=j;i<=j;i++,x--){
                System.out.print(str.charAt(x));
            }
            System.out.println();
        }

    }
}



























