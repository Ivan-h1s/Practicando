package practicando;

import java.util.Scanner;

public class FactorialWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int  number = sc.nextInt();
            int fact = 1;
            //your code goes here
            while(number > 0) {
            fact *= number --;
            } 
        System.out.print(fact); 	
    }
}