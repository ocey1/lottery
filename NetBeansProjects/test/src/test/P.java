
import java.util.Scanner;
import java.util.StringTokenizer;

public class P {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=Integer.parseInt(in.nextLine()),k=0;
        String a[]=new String[t];

        for(int i=0;i<t;i++){
            String s=in.nextLine();
            a[i]=kq(s);    
            StringBuilder result=new StringBuilder();
            if(i==0){
               result.append(a[0]+"@ptit.edu.vn");
                System.out.println(result);
            }
            int count=1;
            for(int j=0;j<i;j++){
                
                if(a[i].equals(a[j])) count++;
                if(i==j+1&&count!=1) {
                    result.append(a[i]+count+"@ptit.edu.vn");
                    System.out.println(result);
                    break;
                }
                if(i==j+1&&count==1){
                     System.out.println(result.append(a[i]+"@ptit.edu.vn"));
                     break;
                }       
            }
           
        }
        
    }
    public static String kq(String s){
        int i=0;
        String a[]=new String[100];
        StringBuilder kq=new StringBuilder();
        StringTokenizer to=new StringTokenizer(s," ");
        while(to.hasMoreTokens()){
            a[i]=to.nextToken();
            i++;
        }
        kq.append(a[i-1].substring(0,a[i-1].length()).toLowerCase());
        for(int j=0;j<i-1;j++){
            kq.append(String.valueOf(a[j].charAt(0)).toLowerCase());
        }
        return kq.toString();

    }
    
}