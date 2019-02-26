package com.codewars.who_likes_it;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static String whoLikesIt(String... names) {
        List<String> listOfNames = Arrays.asList(names);
        if (listOfNames.isEmpty()) {
            return "no one likes this";
        } else if (listOfNames.size() == 1) {
            return listOfNames.get(0) + " likes this";
        } else if (listOfNames.size() == 2) {
            return listOfNames.get(0) + " and " + listOfNames.get(1) + " like this";
        } else if (listOfNames.size() == 3) {
            return listOfNames.get(0) + ", " + listOfNames.get(1) + " and " + listOfNames.get(2) + " like this";
        } else {
            return listOfNames.get(0) + ", " + listOfNames.get(1) + " and " + (listOfNames.size() - 2)
                    + " others like this";
        }
    }
}
