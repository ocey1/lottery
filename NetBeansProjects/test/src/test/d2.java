
package test;

import java.util.*;


public class d2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            t--;
            int n=in.nextInt();
            int a[] = new int[n+2];
            for(int i=1;i<=n;i++){
                a[i] = in.nextInt();
            }
            int check=1;
            for(int i=1;i<=((int)(n/2)+1);i++){
                if(a[i]!=a[n+1-i]){
                    check=0;
                }
            }
            if(check==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}