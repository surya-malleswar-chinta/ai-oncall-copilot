class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else if(stack.isEmpty()) {
                stack.push(ch);
            } else {
                char curCh = stack.peek();
                if (isMatchingBracket(curCh, ch)) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty();
    }

    boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    boolean isMatchingBracket(char ch1, char ch2) {
        if (ch1 == '(' && ch2 == ')') return true;
        if (ch1 == '{' && ch2 == '}') return true;
        if (ch1 == '[' && ch2 == ']') return true;
        return false;
    }
}

