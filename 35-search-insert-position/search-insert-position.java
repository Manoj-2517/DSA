//Approach Used:Binary Search
//Time Complexity:O(logn)
//Space Complexity:O(1)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low=0,high=n-1,ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(ans==-1)
        {
            return low;
        }
        return ans;
    }
}