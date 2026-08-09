class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                s1.append(Character.toLowerCase(c));
            }
        }
        StringBuilder s2 = new StringBuilder(s1).reverse();

        return s1.toString().equals(s2.toString());
    }
}
