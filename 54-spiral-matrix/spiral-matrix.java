//Approach used : use top ,bottom for rows traversal and left,right for column tracking(4 pointer in action).
//Time Complexity:O(n*m) for row and column traversing using the while nested for loop.
//Space Complexity:O(1) we used only the four variables the ans list is the output and it is not used as the extra space , it is a part of Output Result.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int top=0,left=0,bottom=n-1,right=m-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {

                    ans.add(matrix[i][left]);
                }
                left++;
            }
        } 
        return ans;
    }
}