/* 
// https://leetcode.com/problems/number-of-islands/
  200. Number of Islands
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
  */
class Solution {
    public static void DFS(char[][] grid,int i, int j,boolean visited[][])
  {
        int row = grid.length;
        int column = grid[0].length;
        
        if(i<0 || i>= row || j<0 || j>=column || grid[i][j]=='0' || visited[i][j])
        {
            return;
        }
        else
        {
            visited[i][j]=true;
        }
        DFS(grid,i+1,j,visited);
        DFS(grid,i-1,j,visited);
        DFS(grid,i,j+1,visited);
        DFS(grid,i,j-1,visited);
    }
     public int numIslands(char[][] grid) 
  {
        if(grid == null || grid.length == 0)
        {
            return 0;
        }
       
        int row = grid.length;
        int column = grid[0].length;
        int island = 0;
        boolean visited[][]= new boolean[row][column];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    DFS(grid,i,j,visited);
                    island++;
                }
            }
        }
        return island;
    }
}
