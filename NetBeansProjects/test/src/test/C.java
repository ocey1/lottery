


import static java.lang.Math.sqrt;
import java.util.*;


public class C {
    public static boolean nto(long n){
        if (n<2) return false;
        for (int i =2;i<=sqrt(n);i++){
            if(n%i==0){
                return false;
            }   
        }
        return true;
    }
    public static boolean csngt(long n){       
        while(n>0){
            long t = n%10;
            if ( nto(t))
            return false;
                n = n/10;
        
        }
        return true;
    }
        
    public static boolean tngt(long n){
        long tong = 0;
        while(n>0){
            tong = tong+ n%10;
            n = n/10;
        }
        return nto(tong);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
            while(t-->0){
                long a=sc.nextLong();
                long b=sc.nextLong();
                int dem=0;
                for(long i =a; i<=b; i++){
                    if(nto(i)){
                        if(csngt(i)&&tngt(i)) dem++;
                    }
                }
            System.out.println(dem);
            }
        
    }
}
