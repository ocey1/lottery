
package test;

import java.util.*;

public class D {
    public static boolean dx(long a[],int n){
        int d=0,c=n-1;
        while(d<c){
            if(a[d]!=a[c]) return false;
            d++; c--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n,i ;
        long a[]= new long[101];
        while(t-->0){
            n=in.nextInt();
            for(i=0;i<n;i++) a[i]=in.nextInt();
            if(dx(a,n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}