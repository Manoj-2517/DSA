//Approach Used : Merge sort
//Time Complexity:O(nlogn)
//Space Complexity :O(n) for the temporary array used during the merge
class Solution {
    public static int merge(int[] arr, int low,int mid,int high)
    {
        int left = low,right=mid+1;
        ArrayList<Integer>temp= new ArrayList<>();
        int cnt=0;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
                cnt+=(mid-left+1);//to get the count of the inversions;
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
        return cnt;
    }
    public static int mergesort(int arr[],int low,int high){
        int cnt =0;
        while(low>=high)
          return cnt;
        int mid = (low+high)/2;
        cnt+=mergesort(arr,low,mid);
        cnt+=mergesort(arr,mid+1,high);
        cnt+=merge(arr,low,mid,high);
        return cnt;
    }
    static int inversionCount(int arr[]) {
        return mergesort(arr,0,arr.length-1);
        
    }
}