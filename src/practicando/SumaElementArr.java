package practicando;

public class SumaElementArr {

    public static void main(String[] args) {
        int [] myArr = {6, 12, 3, 7};
        int sum = 0;
        for(int i = 0; i < myArr.length; i++) {
            sum += myArr[i] ;
        }
        System.out.println(sum);
    }
}