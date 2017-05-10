package com.jing._07;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * 用两个栈实现队列
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     StackWithTwoQueues
 */

public class QueueWithTwoStacks<T> {

    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public void appendTail(T t) {
        stack1.push(t);
    }

    public T deleteHead() {
        if ((stack1.empty()) && (stack2.empty())) {
            throw new NoSuchElementException("队列为空");
        }
        if (!stack2.empty()) {
            return stack2.pop();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
