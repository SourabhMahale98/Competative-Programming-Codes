
import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        System.out.print("ENTER NO :");

        Scanner sc= new Scanner(System.in);
        int no = sc.nextInt();
        //This will give lenth of no
        // int length = (int)(Math.log10(no)+1);
        // System.out.println(length);
        // int rev = 0;
        // while(length > 0){
        //     int temp = (no % 10) *  (int)Math.pow(10, length-1);
        //     rev = rev + temp;
        //     no= no/10;
        //     length--;
            
        // }
        // System.out.println("Reverse no : " + rev);
        // OR //
        int ans =0;
        while(no>0){
            int rem = no%10;
            no /= 10;
            ans = ans *10 + rem;
            
        }
        System.out.println("Reverse no : " + ans);
        sc.close();
    }
}
