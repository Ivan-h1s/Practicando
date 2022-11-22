package practicando;

import java.util.Scanner;

public class InvertirString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	String text = scanner.nextLine();
	char[] arr = text.toCharArray();
		
	//your code goes here
	String stringInvertida = "";
	for(int i = arr.length - 1; i >= 0; i--) {
	stringInvertida += arr[i] ;
			
	}
	System.out.println(stringInvertida);
        
//		String text = sc.nextLine();
//		//char[] arr = text.toCharArray();
//		
//		//your code goes here
//		String stringInvertida = "";
//		for(int i = text.length() - 1; i >= 0; i--) {
//			stringInvertida += text.charAt(i);
//			
//		}
//		System.out.println(stringInvertida);
    }
}