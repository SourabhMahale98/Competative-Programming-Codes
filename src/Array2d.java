
import java.util.Arrays;
import java.util.Scanner;

public class Array2d{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no = sc.nextInt();
        
        int[][] arr = new int[no][2];

        for(int i = 0;i<no;i++ ){
            for(int j=0;j<arr[i].length;j++){

                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<no;i++ ){
            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=0;i<no;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
        
    }
}