package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        String op;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1:");
        num1 = in.nextDouble();
        System.out.print("Enter num2:");
        num2 = in.nextDouble();
        System.out.print("Enter oper(+,-,*,/):");
        op = in.next();
        switch (op){
            case "+":{
                System.out.println("Result: " + (num1 + num2));
                break;
            }
            case "-":{
                System.out.println("Result: " + (num1 - num2));
                break;
            }
            case "*":{
                System.out.println("Result: " + (num1 * num2));
                break;
            }
            case "/":{
                if(num2 != 0){
                    System.out.println("Result: " + (num1 / num2));
                }else{
                    System.out.println("Error: num2 is 0");
                }
                break;
            }
        }
    }
}
