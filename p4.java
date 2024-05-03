import java.util.*;

public class p4 {
    public static void mirrorTriangle(int n) {
        int nst = n;
        int nsp = 0;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            nst--;
            nsp++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        mirrorTriangle(n);
    }

}