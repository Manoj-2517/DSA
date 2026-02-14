//Approach used: 2 pointer and made i and j as constant , applied 2 pointer approach using k and l by using as the i and j as to trace the array
//Most Important: sort the array before using
//Time Complexity:O(nlogn) for sorting + O(n^2) where n for the 2 pointers i and j loops tracing inside the array and n for the k and l where most tasks were done by this  ==>O(nlogn)+O(n^3) by avoiding smallest the Complexity :-->O(n^3).
//Space Complexity:O(no of quadruplets) we are using this to store the answer and O(1) for no extra space used
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<n;j++)
            {
                if(j!=(i+1) && nums[j]==nums[j-1])
                    continue;
                int k = j+1;
                int l = n-1;
                while(k<l)
                {
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum<target)
                        k++;
                    else if(sum>target)
                       l--;
                    else{
                        List<Integer>temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1])
                            k++;
                        while(k<l && nums[l]==nums[l+1])
                           l--;
                    }
                }
            }
        }
        return ans;
    }
}