class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(String s:strs){
            int n = s.length();
            ans.append(String.valueOf(n) + '#' + s);

        }
        //System.out.println(ans);
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            int j=i;
                while(str.charAt(j) != '#'){
                    j++;
                }
                int len = Integer.parseInt(str.substring(i,j));
                ans.add(str.substring(j+1,j+1+len));
                i=j+len;
        }
        return ans;
    }
}
