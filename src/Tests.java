
import java.io.*;
import java.math.*;
import java.util.Scanner;



public class Tests {
    public static void main(String[] args) throws IOException {
        int a[][] = {
            {1,2,3},
            {4,5 ,6,7},
            {8,9}
        };
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(" "+ j);
            }
            System.out.println();
        }
    }
}
