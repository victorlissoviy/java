package Bingo;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(101);
        int i;
        int tryes = 0;
        Scanner in = new Scanner(System.in);
        do{
            tryes += 1;
            System.out.print("Enter num (or another to exit):");
            try {
                i = in.nextInt();
            }catch (Exception e){
                break;
            }
            if(i > num){
                System.out.println(">");
            }else if(i < num){
                System.out.println("<");
            }
        }while (i != num);
        System.out.println("You tryes: " + tryes);
    }
}
