package practicando;

import java.util.Scanner;

public class ContadorVocales {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");        
        int count = 0;
        
        System.out.println("Ingrese una frase o palabra: ");
        
        String frase = sc.nextLine().toLowerCase();
        
            for(int i = 0; i < frase.length(); i++) {
                if("a".equals(frase.substring(i, i + 1)) || 
                    "e".equals(frase.substring(i, i + 1)) || 
                    "i".equals(frase.substring(i, i + 1)) || 
                    "o".equals(frase.substring(i, i + 1)) || 
                    "u".equals(frase.substring(i, i + 1))) {
                count++;
            }
        }
        System.out.println("Hay " + count + " vocales.");
    }
}