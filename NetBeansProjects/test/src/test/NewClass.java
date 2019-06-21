
package test;


import java.util.Scanner;

public class NewClass{
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
        int t = in.nextInt();
        while(t-->0){
            long a=in.nextLong();
            long b=in.nextLong();
            long m=in.nextLong();
            long l=in.nextLong();
            System.out.println(UCLN(a,b) + " " + (a*b)/UCLN(a,b));
            System.out.println(UCLN(m,l) + " " + (m*l)/UCLN(m,l));
        }
    }
}
