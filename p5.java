import java.util.*;
public class p5{
    public static Scanner scn= new Scanner(System.in);
    public static void fullDiamond(int n){
        int st=1,sp=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;sp++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                sp--;
                st+=2;
            }
            else{
                sp++;
                st-=2;
            }
            System.out.println();
        }   
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        fullDiamond(n);
    }
}