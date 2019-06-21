

import java.util.Scanner;

public class A {
    public static long UCLN(long a , long b){
        while(a!=b){
            if(a>b)
                a=a-b;
            else b= b-a;
        }
        return(a);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        while(t-->0){
            long a=in.nextLong();
            long b=in.nextLong();
            System.out.println(UCLN(a,b) + " " + (a*b)/UCLN(a,b));
        }
    }
}
