class Solution {
    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();

        for(String word : strs){
            encoded_string.append(word.length()).append('#').append(word);
        }

        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);

            int word_len = Integer.parseInt(str.substring(i, hashIndex));

            i = hashIndex + 1;

            decoded_strs.add(str.substring(i, i + word_len));

            i += word_len;
        }

        return decoded_strs;
    }
}
