class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[] = new int[256];
        int left=0,right=0,maxlen=0;
        int n = s.length();
        for(int i=0;i<256;i++)
        {
            hash[i]=-1;
        }
        while(right<n)
        {
            char ch = s.charAt(right);
            if(hash[ch]>=left)
            {
                left = hash[ch]+1;
            }
            hash[ch]=right;
            maxlen = Math.max(right-left+1,maxlen);
            right++;
        }
        return maxlen;
    }
}