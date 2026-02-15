class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        // int[] rearrange = new int[n];
        ArrayList<Integer>pos = new ArrayList<>();
        ArrayList<Integer>neg = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
        }
        if(pos.size()>neg.size())
        {
            int index = neg.size()*2;
            for(int i=0;i<neg.size();i++)
            {
                nums[2*i]=pos.get(i);
                nums[2*i+1]=neg.get(i);
            }
            for(int i=neg.size();i<pos.size();i++)
            {
                nums[index]=pos.get(i);
                index++;
            }
        }
        else{
            int index = pos.size()*2;
            for(int i=0;i<pos.size();i++)
            {
                nums[2*i]=pos.get(i);
                nums[2*i+1]=neg.get(i);
            }
            for(int i=pos.size();i<neg.size();i++)
            {
                nums[index]=neg.get(i);
                index++;
            }
        }
        return nums;

    }
}