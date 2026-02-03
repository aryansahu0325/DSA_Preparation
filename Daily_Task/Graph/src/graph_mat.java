import java.util.*;
public class graph_mat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and cols");
        int V=sc.nextInt();
        int edge=sc.nextInt();
        int mat[][]=new int[V+1][V+1];
        System.out.println("Enter the vertices");
        for(int i=0;i<edge;i++){
            int v=sc.nextInt();
            int u=sc.nextInt();
            mat[u][v]=1;
            mat[v][u]=1;
        }

        for(int i=0;i<V+1;i++){
            for(int j=0;j<V+1;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
