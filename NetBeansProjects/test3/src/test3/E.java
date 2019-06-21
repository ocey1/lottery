
import java.util.Scanner;

public class E {
    static int a[][] = new int[1001][1001];
    static int Check[] = new int[1001];
    static int n, m, u, v, x, y, q;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            n = sc.nextInt();
            m = sc.nextInt();
            Find();
            q = sc.nextInt();
            while(q-->0)
            {
                x = sc.nextInt();
                y = sc.nextInt();
                for(int i=1; i<=n; i++)
                    Check[i] = 1;
                DFS(x);
                System.out.println((Check[y]==0)?"YES":"NO");
            }
        }

    }
    
    public static void Find(){
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=n; i++)
          for(int j=1; j<=n; j++)
              a[i][j] = 0;
        
        for(int i=1; i<=m; i++){
            u = sc.nextInt();
            v = sc.nextInt();
            a[u][v] = 1;
            a[v][u] = 1;
        }
    }
    
    public static void DFS(int u)
    {
        Check[u] = 0;
        for(int v=1; v<=n; v++)
            if(a[u][v] == 1 && Check[v] == 1)
                DFS(v);
    }
}