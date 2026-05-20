package org.example.class5;

public class MyLoops {
    static void main(String[] args) {
//     2. Looping stmts
//        for loop
//        int n = 5;
//
    //        for(int i = 1; i <= n; i++){
    //            System.out.println(i);
    //        }

//        while loop

//        int i = 11;
//        int n = 5;
//
//        while(i <= n){
//            System.out.println(i);
//            i++;
//        }

//        do_while loop

//        int i = 11;
//        int n = 5;
//
//        do{
//            System.out.println(i);
//            i++;
//        }while(i <= n);


//     3. Jumping stmts

        int i = 0;
        int n = 5;

        while(i <= n){
            i++;

            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
