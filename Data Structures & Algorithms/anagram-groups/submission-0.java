class Solution {
    public String findKey(String word){
        int res[] = new int[26];

        for(int i=0; i<word.length(); i++){
            char c = Character.toLowerCase(word.charAt(i));
            res[c - 'a']++;
        }

        String res1 = "";
        for(int i=0; i<26; i++){
            res1+=res[i];
            res1+="₹";
        }

        return res1;
    }
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            String key = findKey(word);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        List<List<String>> l = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            l.add(entry.getValue());
        }

        return l;
    }
}
