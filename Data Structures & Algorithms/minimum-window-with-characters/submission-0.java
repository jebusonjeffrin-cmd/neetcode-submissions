class Solution {
    public String minWindow(String s, String t) {
        int minLen = Integer.MAX_VALUE,s_idx = -1,left=0,count=0;
        int[] freq = new int[256];
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(freq[ch] > 0)count++;
            freq[ch]--;
            
            while(count == t.length()){
                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    s_idx = left;
                }
                char lc = s.charAt(left);
                freq[lc]++;
                if(freq[lc] > 0){
                    count--;
                }
                left++;
            }
        }
        return (s_idx == -1)?"":s.substring(s_idx,s_idx+minLen);
    }
}
