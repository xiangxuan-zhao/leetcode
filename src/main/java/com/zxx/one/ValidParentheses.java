package com.zxx.one;

import java.util.Stack;

/**
 * @author Administrator
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.isEmpty()){
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else  if(c == '['){
                stack.push(']');
            }else if(stack.empty() || c != stack.pop()){
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
