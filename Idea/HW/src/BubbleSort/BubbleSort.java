package BubbleSort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 10;
        int[] mas = new int[n];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Enter mas[" + (i + 1) + "]:");
            mas[i] = in.nextInt();
        }
        in.close();
        int N = mas.length;
        do{
            int newn = 0;
            for(int i = 1;i < N; i+=1){
                if(mas[i - 1] > mas[i]){
                    int temp = mas[i - 1];
                    mas[i - 1] = mas[i];
                    mas[i] = temp;
                    newn = i;
                }
            }
            N = newn;
        }while (N > 1);
        for(int i = 0; i < n; i++){
            System.out.println("mas[" + (i + 1) + "]:" + mas[i]);
        }
    }
}
