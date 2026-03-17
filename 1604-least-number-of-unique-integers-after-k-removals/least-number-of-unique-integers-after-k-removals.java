class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
       HashMap<Integer,Integer> frequencies = new HashMap<>();
       for(int num:arr)
       {
          frequencies.put(num,frequencies.getOrDefault(num,0)+1);
       }
       ArrayList<Integer> freq = new ArrayList<Integer>(frequencies.values());
       Collections.sort(freq);
       int remaining = freq.size();
       for(int f : freq)
       {
         if(k>=f)
         {
            k = k-f;
            remaining--;
         }
         else{
            break;
         }
       }
       return remaining;
    }
}