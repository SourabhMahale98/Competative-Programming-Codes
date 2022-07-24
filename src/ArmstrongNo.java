
import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();

        System.out.println(isArmstrong(i));

    }
    static boolean isArmstrong(int i){
        int temp =0;
        int no = i;
        while(i>0){
            int x = i%10;
            i /= 10;
            temp = temp + (int)Math.pow(x, 3);
        }
        return temp==no;
    }
}
