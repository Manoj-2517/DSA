//Approach used: BINARY SEARCH
//TIME COMPLEXITY:O(logn)
//SPACE COMPLEXITY:O(1) no Extra Space used
class Solution {
    public int findMin(int[] nums) {
        int ans=Integer.MAX_VALUE,low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[low]<=nums[high])//checks if the array is already sorted
            {
                ans = Math.min(ans,nums[low]);
                break;
            }
            if(nums[low]<=nums[mid])
            {
                ans = Math.min(ans,nums[low]);
                low = mid+1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}