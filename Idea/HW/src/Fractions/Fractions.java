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
        if(b == 0){
            return a;
        }
        return CalcGreatestCommonDivisor(b, a % b);
    }
    public static void main(String[] args) {
        System.out.print("Enter n:");
        PrintAllFracs(new Scanner(System.in).nextInt());
    }
}
