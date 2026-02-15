//Approach used:use the col variable and initialize to 1 which represents the first column.
//Time Complexity:O(n*m)+O(n*m)==> the total time complexity O(n*m)
//Space Complexity:O(1) no extra space used.
class Solution {
    public void setZeroes(int[][] matrix) {
        int col=1;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    if(j!=0)
                    {
                        matrix[0][j]=0;
                    }
                    else{
                        col=0;
                    }
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]!=0)
                {
                    if(matrix[i][0]==0 || matrix[0][j]==0)
                    {
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0)
        {
            for(int j=0;j<m;j++)
            {
                matrix[0][j]=0;
            }
        }
        if(col==0)
        {
            for(int i=0;i<n;i++)
            {
                matrix[i][0]=0;
            }
        }
    }
}