class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char a:t.toCharArray()){
            if(!map.containsKey(a)){
                return false;
            }
            else if(map.containsKey(a)){
                int freq = map.get(a);
                if(freq==1){
                    map.remove(a);
                }
                else{
                    map.put(a,freq-1);
                }
            }
        }
        return true;
    }
}
