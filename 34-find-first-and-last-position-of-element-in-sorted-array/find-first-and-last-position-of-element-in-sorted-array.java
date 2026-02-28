class Solution {
    int firstOccur(int[] arr,int x)
    {
        int n =arr.length;
        int low=0,high=n-1,first=-1;
        while(low<=high)
        {
            int mid =(low+high)/2;
            if(arr[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
               high=mid-1;
        }
        return first;
    }
    int lastOccur(int[] arr,int x)
    {
        int n=arr.length;
        int low=0,high=n-1,last=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x)
                low=mid+1;
            else
               high=mid-1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccur(nums,target);
        if(first==-1)
        {
            return new int[]{-1,-1};
        }
        int last = lastOccur(nums,target);
        {
            return new int[]{first,last};
        }
    }
}