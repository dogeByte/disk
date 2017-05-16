package com.jing._22;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 判断入栈序列和出栈序列是否匹配，假设序列中没有重复元素
 * 
 * @version 1.0.0
 * @author JingBo
 */

public class StackPushPopOrder {

    public static <T> boolean isPopOrder(T[] pushArray, T[] popArray) {
        if (pushArray == null || popArray == null) {
            return false;
        }
        int length = 0;
        if ((length = pushArray.length) != popArray.length) {
            return false;
        }
        Deque<T> stack = new ArrayDeque<>();
        int pushIndex = 0;
        int popIndex = 0;
        for (; popIndex < length; popIndex++) {
            while (!popArray[popIndex].equals(stack.peekFirst())) {
                if (pushIndex >= length) {
                    return false;
                }
                stack.addFirst(pushArray[pushIndex++]);
            }
            stack.removeFirst();
        }
        return true;
    }

}
