class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int mxfreq=0,mxlen=0,n=s.length();
        Map<Character,Integer> mp = new HashMap<>();
        for(int right=0;right<n;right++){
            char ch = s.charAt(right);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            mxfreq = Math.max(mxfreq,mp.get(ch));
            while((right-left+1) - mxfreq > k){
                char lc = s.charAt(left);
                int freq = mp.get(lc);
                if(freq == 1)mp.remove(lc);
                else mp.put(lc,freq-1);left++;
            }
            mxlen = Math.max(mxlen,right-left+1);
        }
        return mxlen;
    }
}
