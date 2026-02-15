//Approach used: prefix sum logic , remove the k from the sum then check whether the removed value present in the HashMap.
//Time Complexity:O(n) to traverse through the array
//Space Complexity:O(n) in worst case when all the prefix sum are distinct and Stores in HashMap.
class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt =0;
        int sum=0;
        HashMap<Integer,Integer>ans = new HashMap<>();
        ans.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int remove=sum-k;//important logic
            cnt =cnt+ans.getOrDefault(remove,0);
            ans.put(sum,ans.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}