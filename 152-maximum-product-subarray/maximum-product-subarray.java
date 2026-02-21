class Solution {
    public int maxProduct(int[] nums) {
        int prefixsum=1,suffixsum=1;
        int n=nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(prefixsum==0)
               prefixsum=1;
            if(suffixsum==0)
              suffixsum=1;
            prefixsum*=nums[i];
            suffixsum*=nums[n-i-1];
            maxi = Math.max(maxi,Math.max(prefixsum,suffixsum));
        }
        return maxi;
    }
}