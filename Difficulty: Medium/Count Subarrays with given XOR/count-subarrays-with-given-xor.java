class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> data = new HashMap<>();
        int xr=0;
        long count=0;
        data.put(0,1);
        for(int i=0;i<arr.length;i++)
        {
            xr = xr^arr[i];
            int x = xr^k;
            count+=data.getOrDefault(x,0);
            data.put(xr,data.getOrDefault(xr,0)+1);
            
        }
        return count;
    }
}