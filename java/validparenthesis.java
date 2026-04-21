import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Mapping closing → opening
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char ch : s.toCharArray()) {

            // If it's a closing bracket
            if (map.containsKey(ch)) {

                // If stack empty → invalid
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check matching
                if (top != map.get(ch)) return false;
            } 
            else {
                // Opening bracket → push
                stack.push(ch);
            }
        }

        // Valid only if stack is empty
        return stack.isEmpty();
    }
}