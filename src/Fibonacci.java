

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("Enter no : " + no);
        System.out.println("0");
        int a =0;
        int b=1;
        int sum =0;
        for (int i = 0; i < no-1; i++) {
            
            a=b;
            b=sum;
            sum = a+b;
            System.out.println(" "+ sum+ " ");
        }
    }
}
