package Fractions;

import java.util.Scanner;

public class Fractions {
    public static void PrintAllFracs(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                if(IsFracIrreducible(j, i)){
                    System.out.println(j + " / " + i);
                }
            }
        }

    }
    public static boolean IsFracIrreducible(int a, int b){
        return CalcGreatestCommonDivisor(a, b) == 1;
    }
    public static int CalcGreatestCommonDivisor(int a, int b){
        for(int i = Math.min(a, b); i > 1; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.print("Enter n:");
        PrintAllFracs(new Scanner(System.in).nextInt());
    }
}
