//Approach Used:find the element with just maximum than the selected element from the array
//Time complexity:O(n) we will find the break point and reverse a array in linear time
//Space Complexity:0(1) no extra space used and every thing is done inplace
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index =-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]){
            index=i;
            break;
            }
        }
        if(index==-1){
            int i=0,j=n-1;
            while(i<j)
            {
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        else{
            for(int i=n-1;i>index;i--)
            {
                if(nums[i]>nums[index])
                {
                   int temp = nums[i];
                   nums[i]=nums[index];
                   nums[index]=temp;
                   break;
                }
            }
            int start = index+1,end=n-1;
            while(start<end)
            {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end]= temp;
                start++;
                end--;
            }
        }
    }
}