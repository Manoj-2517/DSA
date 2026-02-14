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