
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(prime(i));
    }

    static Boolean prime(int i){
        if(i<=1){
            return false;
        }
        int c =2;
        while(c*c<=i){
            if(i % c == 0 ){
                return false;
            }
            c++;
        }
        if(c*c>i){
            return true;
        }
        return false;
    }
}
