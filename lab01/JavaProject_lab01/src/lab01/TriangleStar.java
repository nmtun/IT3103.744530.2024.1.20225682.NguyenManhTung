package lab01;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int n = sacnner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sacnner.close();
    }
}
