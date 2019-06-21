
import java.util.Scanner;


public class N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String str;
        while(t-->0){
             str = in.nextLine();
             chuanHoa(str);
        }
    }
   
    static void chuanHoa(String s){
        s=s.toLowerCase();
        String [] ss;
        String s2 = "";
        ss=s.split("");
        for(int i=0; i<ss.length; i++){
            String s1 = "";
            if(ss[i].length() !=0){
                s1+= Character.toUpperCase(ss[i].charAt(0));
                if(ss[i].length() > 1) s1+= ss[i].substring(1);
                s2+= s1;
                if(i< ss.length ) s2+= " ";
            }
        }if(s2.charAt(s2.length()-1) == ' ') s2+= "\b";
        System.out.print(s2);
    }
}
