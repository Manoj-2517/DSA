//Approach Used: Hashing Through HashMap. sum the elements an store in hashmap along with the indices
//Time Complexity:O(n) for tracing over the list and O(1) for hashMap which is a unordered map
//Space Complexity:O(n) in worst case . worst case in the sense storing all elements in array if the sum not equals to target

class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer>lt = new HashMap<>();
        int sum =0,maximum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
            if(sum==0)
            {
                maximum=i+1;// bcoz i is taken initially as 0;
            }
            else{
                if(lt.containsKey(sum))
                {
                    maximum = Math.max(maximum,i-lt.get(sum));
                }
                else{
                    lt.put(sum,i);
                }
            }
        }
        return maximum;
    }
}