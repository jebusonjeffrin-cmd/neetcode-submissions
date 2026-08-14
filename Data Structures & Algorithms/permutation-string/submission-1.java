class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0,n1 = s1.length(),n2 = s2.length();
        if(n1 > n2)return false;

        int[] freq1 = new int[26];
        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
        }
        int[] freq2 = new int[26];
        for(int i=0;i<n1;i++){
            char ch = s2.charAt(i);
            freq2[ch-'a']++;
        }
        if(Arrays.equals(freq1, freq2))return true;
        for(int right=n1;right<n2;right++){
            char ch = s2.charAt(right);
            char temp = s2.charAt(right-n1);
            freq2[temp-'a']--;
            freq2[ch-'a']++;
            if(Arrays.equals(freq1, freq2))return true;
        }
        return false;
    }
}
