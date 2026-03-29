//Approach used: Binary search 
//Time complexity:O(logn)
//space complexity: O(1) no extra space used.
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k)//used<k bcoz we should go forward when we hit the target .if we use <=k then if goes forward right even we hit the k value;
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low+k;//or we can return high+1+k
    }
}