package sem5_pre;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class RightBrackets {
    public static void main(String[] args) {
        System.out.println(rigth_brackets("[a+(b*c)]"));
        System.out.println(rigth_brackets("{a}[+]{(d*3)}"));
        System.out.println(rigth_brackets("{a+]}{(d*3)}"));
    }

    public static boolean rigth_brackets(String expression) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        Deque<Character> stackInput = new LinkedList<>();
        for(char c : expression.toCharArray()) {
            if (map.containsValue(c)) {
                stackInput.push(c);
            } else if (map.containsKey(c)) {
                if (stackInput.isEmpty() || stackInput.pop() != map.get(c)) {
                    return false;
                }
            }
        }
        return stackInput.isEmpty();
    }
}
