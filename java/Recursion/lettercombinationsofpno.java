class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] keypad = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        pad("", digits, ans, keypad);

        return ans;
    }

    static void pad(String p, String up, List<String> ans, String[] keypad) {

        if (up.isEmpty()) {
            ans.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);

            pad(p + ch, up.substring(1), ans, keypad);
        }
    }
}