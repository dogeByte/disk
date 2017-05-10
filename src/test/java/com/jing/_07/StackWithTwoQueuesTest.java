package com.jing._07;

import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StackWithTwoQueuesTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    // 向空栈中添加、删除元素
    @Test
    public void test_Empty() {
        StackWithTwoQueues<String> stack = new StackWithTwoQueues<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        Assert.assertEquals("c", stack.pop());
        Assert.assertEquals("b", stack.pop());
        Assert.assertEquals("a", stack.pop());
    }

    // 向非空栈中添加、删除元素
    @Test
    public void test_NotEmpty() {
        StackWithTwoQueues<String> stack = new StackWithTwoQueues<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.pop();
        stack.push("d");
        stack.push("e");
        Assert.assertEquals("e", stack.pop());
        Assert.assertEquals("d", stack.pop());
        Assert.assertEquals("b", stack.pop());
        Assert.assertEquals("a", stack.pop());
    }

    // 从空栈中删除元素
    @Test
    public void test_DeleteEmpty() {
        StackWithTwoQueues<String> stack = new StackWithTwoQueues<>();
        expectedException.expect(NoSuchElementException.class);
        expectedException.expectMessage("栈为空");
        stack.pop();
    }
}
