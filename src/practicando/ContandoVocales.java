package practicando;
import java.util.Scanner;

class contandoVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        int count = 0;
        
        System.out.println("Ingrese una frase"); 
        String frase = sc.nextLine();
        
        for(int i = 0; i < frase.length(); i++) {  
            char letras = frase.charAt(i);
                if(vowel(letras)) {
                    count++;
                }
            }    
            System.out.println("Total de vocales: "+count);

        //contarVocales(frase);
        System.out.println("Total de vocales con otra funcion: "+contarVocales(frase));    
    }
    public static boolean vowel(char c) {
        boolean n = "aeiouAEIOU".indexOf(c)>=0;
        return n;
    }

    public static int contarVocales(String s){
    int totalVocales = s.replaceAll("[^AEIOUaeiouÁÉÍÓÚáéíóú]","").length();
    return totalVocales;
}
}