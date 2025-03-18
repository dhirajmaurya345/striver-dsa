package basic;

public class Patterns {

    public static void main(String[] args){
        int rows=4;
        int cols=4;
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

        for(int i=1;i<=rows;i++){
            for(int j=2;j<=i;j++){
                System.out.print('*');
            }
            for(int j=i;j<=cols;j++){
                System.out.print(' ');
            }
            System.out.println();
        }

        for (int i=1;i<=rows;i++){
            for(int j=i;j<=cols;j++){
                System.out.print('*');
            }
            for(int j=1;j<=i;j++){
                System.out.print(' ');
            }
            System.out.println();
        }

    }
}



























