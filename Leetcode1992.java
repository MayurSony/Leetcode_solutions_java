// Question : 
// You are given a 0-indexed m x n binary matrix land where a 0 represents a hectare of forested land and a 1 represents a hectare of farmland.

// To keep the land organized, there are designated rectangular areas of hectares that consist entirely of farmland. These rectangular areas are called groups. No two groups are adjacent, meaning farmland in one group is not four-directionally adjacent to another farmland in a different group.

// land can be represented by a coordinate system where the top left corner of land is (0, 0) and the bottom right corner of land is (m-1, n-1). 
// Find the coordinates of the top left and bottom right corner of each group of farmland.
//  A group of farmland with a top left corner at (r1, c1) and a bottom right corner at (r2, c2) is represented by the 4-length array [r1, c1, r2, c2].

// Return a 2D array containing the 4-length arrays described above for each group of farmland in land.
//  If there are no groups of farmland, return an empty array. You may return the answer in any order.

//Code :

// class Solution {
//     int row2 ; 
//     int col2 ;
//     public void dfs(int i , int j , int [][] land){
//         if( i<0 || j<0 || i>=land.length || j>=land[0].length || land[i][j]!=1){
//             return ;
//         }

//         row2 = Math.max(row2,i);
//         col2 = Math.max(col2,j);

//         land[i][j] =-1;

//         dfs(i+1,j,land);
//         dfs(i-1,j,land);
//         dfs(i,j+1,land);
//         dfs(i,j-1,land);
//     }
//     public int[][] findFarmland(int[][] land) {

//         int m = land.length;
//         int n = land[0].length;
//         List<int[]> ans = new ArrayList<>();
//         for(int i = 0;i<m;i++){
//             for(int j = 0 ;j<n;j++){
//                  if(land[i][j]==1){
//                     row2 = 0;
//                     col2 = 0;
//                     dfs(i,j,land);
//                      int[] arr = new int[] {i, j, row2, col2};
//                      ans.add(arr);
//                  }
//             }
//         }
//        return ans.stream().toArray(int[][] :: new);
//     }
// }

/*


m * n binary matrix 

0 -> forested land
1 -> farm land


groups 

no group should be adjacent to identical group in four sides





*/