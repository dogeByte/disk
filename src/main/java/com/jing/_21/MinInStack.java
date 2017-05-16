package com.jing._21;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

/**
 * 实现一个能以O(1)的时间得到最小值元素的栈结构
 * 
 * @version 1.0.0
 * @author JingBo
 */

public class MinInStack<T extends Comparable<T>> {

    private Deque<T> elementStack = new ArrayDeque<>();
    private Deque<T> minimumStack = new ArrayDeque<>();

    public void push(T t) {
        elementStack.addFirst(t);
        if (minimumStack.isEmpty() || t.compareTo(minimumStack.peekFirst()) < 0) {
            minimumStack.addFirst(t);
        } else {
            minimumStack.addFirst(minimumStack.peekFirst());
        }
    }

    public T pop() {
        if (elementStack.isEmpty() || minimumStack.isEmpty()) {
            throw new NoSuchElementException("栈为空");
        }
        minimumStack.removeFirst();
        return elementStack.removeFirst();
    }

    public T min() {
        if (elementStack.isEmpty() || minimumStack.isEmpty()) {
            throw new NoSuchElementException("栈为空");
        }
        return minimumStack.peekFirst();
    }

}
