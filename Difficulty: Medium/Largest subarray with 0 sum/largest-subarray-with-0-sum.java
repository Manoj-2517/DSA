class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer>lt = new HashMap<>();
        int sum =0,maxi=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
            if(sum==0)
            {
                maxi =i+1;// bcoz i is taken initially as 0;
            }
            else{
                if(lt.containsKey(sum))
                {
                    maxi = Math.max(maxi,i-lt.get(sum));
                }
                else{
                    lt.put(sum,i);
                }
            }
        }
        return maxi;
    }
}