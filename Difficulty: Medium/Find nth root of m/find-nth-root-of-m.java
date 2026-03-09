class Solution {
    int multiply(int num,int n)
    {
        int ans1=1;
        for(int i=0;i<n;i++)
        {
            ans1 = ans1*num;
        }
        return ans1;
    }
    public int nthRoot(int n, int m) {
        // code here
        int low=0,high=m;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int ans = multiply(mid,n);
            if(ans==m)
            {
              return mid;
            }
            if(ans<m)
            {
                low = mid+1;
            }
            else{
             high = mid-1;
            }
        }
        return -1;//dummy value
    }
}