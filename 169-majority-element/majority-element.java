//Approach used: Moore's Voting Algorithm, which states that intially assign count=0, go through the array and make the check if count ==0, if it is then increment count to 1 and assign array element at i to respective Variable el.
//Trace over the loop if the el == nums[i] the increment count if not decrement the count.
//Time Complexity:Actually O(2n) by removing constants O(N) optimal approach.
//Space Complexity:O(1) no extra space used.
class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int el =Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count=1;
                el = nums[i];
            }
            else if(nums[i]==el)
            {
                count++;
            }
            else{
                count--;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==el)
            {
                count++;
            }
            if(count>n/2)
            {
                return el;
            }
        }
        return -1;
    }
}