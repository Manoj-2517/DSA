//Approach used:Binary Search.
//Time complexity:O(logn) in average case , but in worst case(shrinking the array until getting valid element to proceed further by low++, high--) O(n/2);
//Space Complexity:O(1) no extra space used.
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low =0,high=n-1;
        while(low<=high)
        {
            int mid =(low+high)>>1;
            if(nums[mid]==target)
               return true;
            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                low++;
                high--;
                continue;
            }
    //check whether the left is sorted , and if sorted check whether elements lies between the left part
            if(nums[low]<=nums[mid])
            {
                if(target>=nums[low] && target<=nums[mid])
                {
                    high = mid-1;
                }
                else
                   low = mid+1;
            }
            else{
                if(target>=nums[mid] && target<=nums[high])
                    low= mid+1;
                else
                   high = mid-1;
            }
        }
        return false;
    }
}