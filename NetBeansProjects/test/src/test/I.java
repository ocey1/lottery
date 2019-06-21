
import java.util.Scanner;


public class I {
     static int count = 0;
    
    public static void main(String[] args) {
        inIt();
    }
    
    static void topRight(int[][] matrix, int x1, int y1, int x2, int y2 ){
        for(int i = x1; i<= x2; i++ )
            matrix[y1][i] = count++;
        for(int i  = y1+1; i<= y2; i++ )
            matrix[i][x2] = count++;
        if(x2-x1> 0 && y2-y1 > 0 ) {
            y1++;
            x2--;
            bottomLeft(matrix,x1,y1,x2,y2);
        }
    }
    
    static void bottomLeft(int[][] matrix, int x1, int y1, int x2, int y2){
        for(int i = x2; i>= x1; i-- )
            matrix[y2][i] = count++;
        for(int i = y2-1; i>= y1; i--)
            matrix[i][x1] = count++;
        if(x2-x1 > 0 && y2-y1 > 0 ){
            y2--;
            x1++;
            topRight(matrix,x1,y1,x2,y2);
        }
    }
    
    static void inIt(){
        int[][] matrix;
        int n;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        System.out.println("Test"+ (t-(t-1)) +":");
       // m = sc.nextInt();
        n = sc.nextInt();
        matrix = new int[n][n];
        topRight(matrix,0,0,n-1,n-1);
        display(matrix);
        }
    }
    
    static void display(int [][] matrix ){
        for(int [] x: matrix){
            for(int i: x) System.out.printf(i+" ");
           // System.out.println("\n");
        }
    }
}
