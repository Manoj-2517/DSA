//Approach used: merging the intervals by checking the end element of 1st intervals and 1st element end interval.
//Time Complexity:O(n) For checking all the intervals and merging.
//Space Complexity:O(n) in worst case if the given intervals in form of [1,2][3,4][5,6]
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>ans = new ArrayList<>();
        int n = intervals.length;
        for(int i=0;i<n;i++)
        {
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1)[1])
            {
                ans.add(intervals[i]);
            }
            else
            {
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
            }
        }
        int[][] result = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
        {
            result[i][0] = ans.get(i)[0];
            result[i][1] = ans.get(i)[1];
        }
        return result;
        
    }
}