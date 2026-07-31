class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> mp = new HashMap<>();
        for(String s:strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String str = new String(temp);
            if(!mp.containsKey(str)){
                mp.put(str,new ArrayList<>());
            }
            mp.get(str).add(s);
        }
        for(List<String> L:mp.values()){
            ans.add(L);
        }
        return ans;
    }
}
