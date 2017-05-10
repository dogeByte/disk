package com.jing._07;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * 用两个队列实现栈
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     QueueWithTwoStacks
 */

public class StackWithTwoQueues<T> {

    private Queue<T> queue1 = new ArrayDeque<>();
    private Queue<T> queue2 = new ArrayDeque<>();

    public void push(T t) {
        if (!queue1.isEmpty()) {
            queue1.add(t);
        } else {
            queue2.add(t);
        }
    }

    public T pop() {
        if ((queue1.isEmpty()) && (queue2.isEmpty())) {
            throw new NoSuchElementException("栈为空");
        }
        if (!queue1.isEmpty()) {
            int size = queue1.size();
            for (int i = 0; i < size - 1; i++) {
                queue2.add(queue1.remove());
            }
            return queue1.remove();
        }
        int size = queue2.size();
        for (int i = 0; i < size - 1; i++) {
            queue1.add(queue2.remove());
        }
        return queue2.remove();
    }
}
