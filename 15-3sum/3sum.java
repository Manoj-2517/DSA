//Approach used: 2 pointer and made i as constant , applied 2 pointer approach using j and k by using as the outer loop.
//Most Important: sort the array before using
//Time Complexity:O(nlogn) for sorting + O(n^2) where n for the 2 pointers tracing inside the array and n for the outer loop ==>O(nlogn)+O(n^2) by avoiding smallest the Complexity :-->O(n^2).
//Space Complexity:O(no of triplets) we are using this to store the answer and O(1) for no extra space used
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int j = i+1;
            int k = n-1;
            while(j<k)
            {
                int sum =nums[i]+nums[j]+nums[k];
                if(sum<0)
                   j++;
                else if(sum>0)
                   k--;
                else{
                    List<Integer>temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                       j++;
                    while(j<k && nums[k]==nums[k+1])
                       k--;
                 }
            }
        }
        return ans;
    }
}