import java.util.*;
public class connectedcomponent {
    static int dr[]={-1,1,0,0};
    static int dc[]={0,0,-1,1};
    static int rowL;
    static int colL;
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 0, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}, {0, 0, 1, 1}};
        rowL = grid.length;
        colL = grid[0].length;
        boolean visited[][] = new boolean[rowL][colL];
        int component = 0;
        for (int i = 0; i < rowL; i++) {
            for (int j = 0; j < colL; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    dfs(i, j, visited, grid);
                    component++;
                }
            }
        }
        System.out.println("No. of components:"+component);
    }
        public static void dfs(int r,int c, boolean visited[][],int grid[][]){
            if(r<0||c<0||r>=rowL||c>=colL||grid[r][c]==0)
                return;
            if(visited[r][c]==true)
                return;
            visited[r][c]=true;
                dfs(r-1,c,visited,grid);//up
                dfs(r+1,c,visited,grid);//down
                dfs(r,c-1,visited,grid);//left
                dfs(r,c+1,visited,grid);//right
            for(int i=0;i<4;i++)
            {
                dfs(r+dr[i],c+dc[i],visited,grid);
            }
        }
}
//Space Complexity:-O(R*C)
//Time Complexity:-O(R*C)