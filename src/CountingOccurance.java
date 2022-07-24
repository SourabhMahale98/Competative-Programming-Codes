
import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int check = sc.nextInt();
        int count =0;
        while(num>0){
            int rem = num%10;
            if(rem==check){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
        sc.close();
    }
}
