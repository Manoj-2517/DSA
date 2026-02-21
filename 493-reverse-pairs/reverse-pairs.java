//Approach Used: Merge Sort
//Time Complexity:O(nlogn)//used merge sort approach
//Space Complexity:O(n)//Used temp List
class Solution {
    public void merge(int[] arr,int low,int mid,int high)
    {
        ArrayList<Integer>temp = new ArrayList<>();
        int left=low,right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left++]);
        }
        while(right<=high)
        {
            temp.add(arr[right++]);
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }
    }
    int countpairs(int[]arr,int low,int mid,int high)
    {
        int cnt=0;
        int right = mid+1;
        for(int i=low;i<=mid;i++)// we are iterating to the left part of the array
        {
            while(right<=high && arr[i]>2L*arr[right]){
             right++;
            }//increment the value until the condition unsatisfy
            cnt+=(right-(mid+1)); //get the count 
        }
        return cnt;
    }
    int mergesort(int[] arr,int low,int high)
    {
        int cnt=0;
        while(low>=high)
        {
            return cnt;
        }
        int mid = (low+high)/2;
        cnt+=mergesort(arr,low,mid);
        cnt+=mergesort(arr,mid+1,high);
        cnt+=countpairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return cnt;
    }

    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
}