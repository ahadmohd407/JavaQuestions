class Solution {
    public int strStr(String haystack, String needle) {
        int nedLength=needle.length();
        int hayLength=haystack.length();
        int res=0;
        if(hayLength==nedLength && haystack.equals(needle))
            return 0;
        for(int j=0;j<hayLength-nedLength+1;j++)
            {
                if(haystack.substring(j,j+nedLength).equals(needle))
                  return j;
            }
        return -1;
    }
}
