package practicando;
import java.util.Scanner;
class VocalOrConsonante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
         
        System.out.println("Ingrese una letra"); 
        
        char letra = sc.next().charAt(0);
        
        boolean isVowel = vowel(letra);
                // Printing the output
        if(isVowel) 
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
    public static boolean vowel(char c) {
        return "aeiouAEIOU".indexOf(c)>=0;
    }
}