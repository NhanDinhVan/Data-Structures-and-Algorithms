package org.example.data_structures.String;

import java.util.Stack;

/**
 * _2696_Leetcode_Minimum_String_Length_After_Removing_Substrings
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/7/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/7/2024    NhanDinhVan    Create
 */

public class _2696_Leetcode_Minimum_String_Length_After_Removing_Substrings {
    public int minLength(String s) {
//        if(s.length() < 2)
//            return s.length();
//        int l = 0;
//        int r = 1;
//        while(r < s.length()){
//            String s1 = s.substring(l, r);
//            if(s1.equals("AB") || s1.equals("CD")){
//                s = s.substring(0,l) + s.substring(r+1);
//                l = 0;
//                r = 1;
//            }else{
//                l++; r++;
//            }
//        }
//        return s.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && ((stack.peek() == 'A' && s.charAt(i) == 'B') || (stack.peek() == 'C' && s.charAt(i) == 'D'))){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.size();
    }
}
