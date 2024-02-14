package src;

import java.util.Scanner;

public class labclass {
    public static boolean main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       int number= scanner.nextInt();
       if (detectThePrime(number)){
           System.out.println("Prime");

       }
       else{
           System.out.println("Not");

       }

       public boolean detectThePrime(number){
           if(number<=1){
               return false;
           }
           for(int i=2; i<number/2; i++){
               if (number/i == 0) {
                   System.out.println("Prime");
               }
               return true;
           }


        }

    }

};





