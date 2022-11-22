package practicando;
//Math.random()conNegativos
public class Program {

    public static void main(String[] args) {
        int []arr = new int[10];
        fillRandomNumNegAndPos(arr);   
        }
        
    public static void fillRandomNumNegAndPos(int[] arr) {
        int max = 4;
        int min = - 4;
        int range = max - min + 1;
        for(int i = 0; i < arr.length; i ++) {
            //arr[i] = i + 1;
            //arr[i] =((int)(Math.random()*(4 - (-4) + 1)+(-4)));
        arr[i] = (int)(Math.random() * range + min);
        System.out.println(arr[i]);
        }
    }
}