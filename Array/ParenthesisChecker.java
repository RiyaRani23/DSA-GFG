public class ParenthesisChecker {
    static boolean isBalanced(String s) {
        char[] brackets = new char[s.length()];
        int pointer = 0;  
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                brackets[pointer++] = ch;
            } else {
                if (pointer == 0) 
                  return false; 

                char lastOpen = brackets[pointer - 1]; 
                if ((ch == ')' && lastOpen != '(') ||
                    (ch == '}' && lastOpen != '{') ||
                    (ch == ']' && lastOpen != '[')) {
                    return false;
                }

                pointer--; 
            }
        }

        return pointer == 0;
    }
}
