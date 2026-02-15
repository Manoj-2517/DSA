//Approach used: Transpose the matrix and the reverse the rows
//Time Complexity: O(n^2) for transposing And O(n^2) for reversal . the overall is O(n^2).
//Space Complexity: O(1) no extra space used,every thing done inplace
class Solution {
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            int left=0,right=n-1;
            while(left<right)
            {
                int temp = matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
           
        }
    }
}