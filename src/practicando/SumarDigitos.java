package practicando;

public class SumarDigitos {
    public static void main(String[] args) {
        int n = 1234;
		//int dig;
        int sum = 0;
        while(n != 0) {
            int dig = n % 10;
            sum += dig;
            n = n/10;
        }
        System.out.println(sum);
	}
}