//The approach used:let assume ans = 1 bcoz for every row the triangle has 1 at starting and at end.
//use formula to generate row: ans= ans*(row-col+1)/col.
//Time complexity:Actually O(2n) By avoiding constant i will be O(n);
//Space Complexity:O(n) to return the array.
class Solution {
    public List<Integer>generaterow(int row)
    {
        List<Integer>lt = new ArrayList<>();
        long ans=1;
        lt.add((int)ans);
        for(int col=1;col<=row;col++)
        {
            ans = ans*(row-col+1)/col;
            lt.add((int)ans);
        }
        return lt;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ans.add(generaterow(i));
        }
        return ans;
    }
}