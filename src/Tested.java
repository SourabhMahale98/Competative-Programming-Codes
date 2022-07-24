
import java.io.*;
import java.util.*;

public class Tested {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            try{
                Long no = sc.nextLong();
                System.out.println(no + " can be fitted in:");
                if(no>= -128 && no<=127) System.out.println("* byte");
                if(no >= -32768 && no<=32767) System.out.println("* short");
                if(no >= -Math.pow(2, 31) && no<= (Math.pow(2, 32)-1)) System.out.println("* int");
                if(no >= -Math.pow(2, 63) && no<= (Math.pow(2, 63)-1)) System.out.println("* long");

            }catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            };
        }
    }
}
