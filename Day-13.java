package javaPrograms;
import java.util.*;

public class patternPrint4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.err.println("Enter the number of levels : ");
        int n = scn.nextInt();
        int space = 0;
        int star = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }

            System.out.println();
            space++;
            star--;
        }
    }
}
