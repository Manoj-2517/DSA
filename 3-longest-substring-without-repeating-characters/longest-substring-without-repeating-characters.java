class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> track = new HashMap<>();
        int left=0,right=0,maxlen=0;
        int n = s.length();
        while(right<n)
        {
            char ch = s.charAt(right);
            if(track.containsKey(ch) && track.get(ch)>=left)
            {
                left = track.get(ch)+1;
            }
            track.put(ch,right);
            maxlen = Math.max(right-left+1,maxlen);
            right++;
        }
        return maxlen;
    }
}