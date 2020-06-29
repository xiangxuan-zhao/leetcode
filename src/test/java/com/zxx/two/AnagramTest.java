package com.zxx.two;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiangxuan
 * @date 2020/5/26
 */
public class AnagramTest {


    @Test
    public void isAnagram() {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("anagram",
                "nagaram"));
    }
}