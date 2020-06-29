package com.zxx.two;

import java.util.Arrays;

/**
 * 242.有效的字母异位词
 * @author xiangxuan
 * @date 2020/5/26
 */
public class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null){
            return false;
        }
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        return String.valueOf(cs).equals(String.valueOf(ct));
    }
}
