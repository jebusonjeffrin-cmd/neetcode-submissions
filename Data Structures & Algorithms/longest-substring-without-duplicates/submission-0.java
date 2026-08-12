class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,n=s.length();
        Set<Character> st = new HashSet<>();
        int ans=0;
        for(int right=0;right<n;right++){
            char ch = s.charAt(right);
            while(st.contains(ch)){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(right));
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }

}
