package org.example;


import java.util.*;
import java.util.stream.Collectors;

public class CollectionStringReverse {

    public static void main(String[] args){

        String input="Hello there";
        String output=reverseString(input);
        System.out.println(output);
    }
    public static String reverseString(String str){

        if(str==null||str.equals("")){

            return str;
        }

        List<Character> charMap= new LinkedList<>();

        for (char c:str.toCharArray()
             ) {
            charMap.add(c);
        }
        Collections.reverse(charMap);

        return charMap.stream().map(String::valueOf).collect(Collectors.joining());


    }
}
