package practicando;

import java.util.Scanner;

public class IntABinario {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Convertir número entero a binario");
        int num = input.nextInt();
        System.out.println("binario: \n" + toBinary(num));
        
    }
    
    public static String toBinary(int num) {
        String binaryStr = Integer.toBinaryString(num);
        return binaryStr;
    }
}