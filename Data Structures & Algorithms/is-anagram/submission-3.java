class Solution {
    public boolean isAnagram(String s, String t) {
        LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<>();
        LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        for(Character c : s1){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }

        for(Character c : t1){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        return map1.equals(map2);
    }
}
