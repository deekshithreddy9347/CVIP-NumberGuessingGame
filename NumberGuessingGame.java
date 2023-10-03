import java.util.*;
import java.util.Random;
import java.util.Scanner;


class Random_number{
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        Random r1=new Random();
        System.out.println("Enter the range upto random number will printed:");
        int range=sc1.nextInt();
        int random_number=r1.nextInt(range);
        System.out.println("Enter how many chances to guess correct number:");
        int n=sc1.nextInt();
        int choice=0;
        while(choice<n){
        System.out.println("Enter your guess random number:");
        int guess_number=sc1.nextInt();
        if(random_number==guess_number){
            System.out.println("Your guessing number is correct");
            System.out.println("The random number is:"+random_number);
            System.out.println("You won the game!!!");
            break;
        }
        else if(guess_number>random_number){
            System.out.println("your guess number is too high");
            System.out.println("you have another "+(n-choice)+" chances");
        }
        else{
           System.out.println("Your guessing is incorrect!!!");
           System.out.println("you have another "+(n-choice)+" chances");
           System.out.println("Try again...");
        }
        choice+=1;
    }
     System.out.println("Successfully your game is finished");


    }
}