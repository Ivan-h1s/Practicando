package practicando;

import java.util.Scanner;

public class AverageWordLength {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra");        
        String str = read.nextLine();
        
        String removeSpecialChar = str.replaceAll("[,.!?]", "");
        String [] arr = removeSpecialChar.split(" ");
        //System.out.println(arr.length);
        
        double sum = 0, count = 0, average;
        for(int i = 0; i < arr.length; i++) {
            int wordLen = arr[i].length();
            sum += wordLen;
            count++;
        }
        average = sum/count;
        System.out.println("Promedio de letras: " + (int)Math.ceil(average));        
    }    
}