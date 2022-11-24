package practicando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProgramArrayList {
 public static void main(String[] args) {

             ArrayList <Integer> nums = new ArrayList();

        Scanner sc = new Scanner(System.in);
        int max, min;

        while(nums.size() < 5) {
            int n = sc.nextInt();
            
            nums.add(n);
        }
		
        max = Collections.max(nums);
        min = Collections.min(nums);
        
        System.out.println(max);
        System.out.println(min);
    }
}
/*Sorting Lists

The program you are given declares ArrayList of integers.
Complete the program to take numbers as input and add them to ArrayList 
until its size isn't equal to 5. Then output its maximum and minimum values.

Sample Input
4
12
3
88
96

Sample Output
96
3
Use Collections.max() and Collections.min() to get the maximum and the minimum.
*/