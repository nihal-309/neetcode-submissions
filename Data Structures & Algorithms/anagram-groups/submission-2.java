class Solution {
    public String findKey(String word){
        int res[] = new int[26];

        for(int i=0; i<word.length(); i++){
            char c = Character.toLowerCase(word.charAt(i));
            res[c - 'a']++;
        }

        StringBuilder res1 = new StringBuilder();
        for(int i=0; i<26; i++){
            res1.append(res[i]);
            res1.append("₹");
        }

        return res1.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            String key = findKey(word);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
