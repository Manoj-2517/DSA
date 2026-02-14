//Approach used: Moore's Voting Algorithm, which states that intially assign count=0, go through the array and make the check if count ==0, if it is then increment count to 1 and assign array element at i to respective Variable el this problem consider two count variables and 2 el variables and follow the same approach mentioned above.To avoid redundancy , while checking count1 ==0 as well as check that the current element is equal to el1 and viceversa for count2.
//Trace over the loop if the el == nums[i] the increment count if not decrement the count.
//Time Complexity:Actually O(2n) by removing constants O(N) optimal approach.
//Space Complexity:O(1) it only stores the two elements because consider a example as n=8 and n/3 =2,so we need element with minimum count 3 , assume  if it stores 3 elements i will be 3+3+3 > 8 so it is not possible.
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count1=0,count2=0,el1=0,el2=0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(count1==0 && nums[i]!=el2)
            {
                count1=1;
                el1=nums[i];
            }
            else if(count2==0 && nums[i]!=el1)
            {
                count2=1;
                el2=nums[i];
            }
            else if(nums[i]==el1)
               count1++;
            else if(nums[i]==el2)
               count2++;
            else{
              count1--;
              count2--;
            }
        }
        int mini = (int)(n/3);
        count1=0;
        count2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==el1)
                count1++;
            if(nums[i]==el2 && el2!=el1)
                count2++;
               
        }
        if(count1>mini)
            ans.add(el1);
        if(count2>mini)
           ans.add(el2);
        return ans;
    }
}