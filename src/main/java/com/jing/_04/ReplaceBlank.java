package com.jing._04;

/**
 * 把字符串中的空格替换为"%20"
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class ReplaceBlank {

    public static String replace(String str) {
        if ((str == null) || (str.length() == 0)) {
            return str;
        }
        char[] array = str.toCharArray();
        int length = array.length;
        int newLength = length;
        for (int i = 0; i < length; i++) {
            if (' ' == array[i]) {
                newLength += 2;
            }
        }
        char[] newArray = new char[newLength];
        int i = length - 1;
        for (int j = newLength - 1; i >= 0; i--) {
            if (' ' == array[i]) {
                newArray[(j--)] = '0';
                newArray[(j--)] = '2';
                newArray[(j--)] = '%';
            } else {
                newArray[(j--)] = array[i];
            }
        }
        return new String(newArray);
    }

    @Deprecated
    public static String _replace(String str) {
        return str.replace(" ", "%20");
    }
}
