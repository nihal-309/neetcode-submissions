class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "__EMPTY_LIST__";
        }
        String delimiter = "é";
        StringBuilder encoded_string= new StringBuilder();

        for(String word : strs){
            encoded_string.append(word);
            encoded_string.append(delimiter);
        }

        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        if (str.equals("__EMPTY_LIST__")) {
            return new ArrayList<>();
        }

        String delimiter = "é";

        String[] decoded_strs = str.split(Pattern.quote(delimiter), -1); 
        List<String> result = new ArrayList<>(Arrays.asList(decoded_strs));
        if (!result.isEmpty()) {
            result.remove(result.size() - 1);
        }

        return result;
    }
}
