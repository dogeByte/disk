package com.jing._07;

import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QueueWithTwoStacksTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    // 向空队列中添加、删除元素
    @Test
    public void test_Empty() {
        QueueWithTwoStacks<String> queue = new QueueWithTwoStacks<>();
        queue.appendTail("a");
        queue.appendTail("b");
        queue.appendTail("c");
        Assert.assertEquals("a", queue.deleteHead());
        Assert.assertEquals("b", queue.deleteHead());
        Assert.assertEquals("c", queue.deleteHead());
    }

    // 向非空队列中添加、删除元素
    @Test
    public void test_NotEmpty() {
        QueueWithTwoStacks<String> queue = new QueueWithTwoStacks<>();
        queue.appendTail("a");
        queue.appendTail("b");
        queue.appendTail("c");
        queue.deleteHead();
        queue.appendTail("d");
        queue.appendTail("e");
        Assert.assertEquals("b", queue.deleteHead());
        Assert.assertEquals("c", queue.deleteHead());
        Assert.assertEquals("d", queue.deleteHead());
        Assert.assertEquals("e", queue.deleteHead());
    }

    // 从空队列中删除元素
    @Test
    public void test_DeleteEmpty() {
        QueueWithTwoStacks<String> queue = new QueueWithTwoStacks<>();
        expectedException.expect(NoSuchElementException.class);
        expectedException.expectMessage("队列为空");
        queue.deleteHead();
    }
}
