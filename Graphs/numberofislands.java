import java.util.*;
public class numberofislands {
   public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int visited[][] = new int[m][n];
        int count = 0;
        for(int row = 0; row < m; row++) {
            for(int col = 0; col < n; col++) {
                if(visited[row][col] == 0 && grid[row][col] == '1') {
                    count++;
                    bfs(row, col, visited, grid);
                }
            }
        }

        return count;
    }

    private void bfs(int row, int col, int[][] visited, char[][] grid) {
        int[] dx = {-1, 1, 0, 0}; // Possible moves in row direction
        int[] dy = {0, 0, -1, 1}; // Possible moves in column direction

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col}); // Add the starting cell to the queue
        visited[row][col] = 1; // Mark the starting cell as visited

        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // Get the current cell from the queue
            int x = current[0];
            int y = current[1];

            // Check all four directions from the current cell
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                // Check if the new cell is within the grid and is an unvisited land cell
                if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length &&
                    visited[newX][newY] == 0 && grid[newX][newY] == '1') {
                    queue.offer(new int[]{newX, newY}); // Add the new cell to the queue
                    visited[newX][newY] = 1; // Mark the new cell as visited
                }
            }
        }
    }
}


