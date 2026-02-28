//Approach used: binary search, here after finding mid element there is a possibility of mightt left par is sorted or the right part is sorted.
//Time complexity:O(logn);
//Space Complexity:O(1) no extra space used.
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length,low=0,high=n-1;
        while(low<=high)
        {
            int mid = (low+high)>>1;
            if(nums[mid]==target)
                return mid;
            if(nums[low]<=nums[mid]){//checks whether the left part of the array is sorted
                if(target>=nums[low] && target<=nums[mid])
                {
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{ // if not left the right sorted
                if(target>=nums[mid] && target<=nums[high])
                {
                    low = mid+1;
                }
                else{
                    high= mid-1;
                }
            }
        }
        return -1;
    }
}