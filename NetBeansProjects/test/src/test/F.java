
import java.util.Scanner;


public class F {
    static void phanTich(long n){
        int i= 2;
        int dem =0;
        while(n>0){
            if(n%i == 0){
                dem++;
                if (n == i) System.out.print(" "+i+"("+dem+") ");
                n/=i;
            }
            else i++;
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->1){
            long n= sc.nextLong();
            System.out.println("Test"+ (t-(t-1)) +":");
            phanTich(n);
        }
    }
}
