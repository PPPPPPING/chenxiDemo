package leetCode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Description 739. 每日温度
 * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 * 示例 1:
 * 输入: temperatures = [73,74,75,71,69,72,76,73]
 * 输出: [1,1,4,2,1,1,0,0]
 * 示例 2:
 * 输入: temperatures = [30,40,50,60]
 * 输出: [1,1,1,0]
 * 示例 3:
 * 输入: temperatures = [30,60,90]
 * 输出: [1,1,0]
 * 提示：
 * 1 <= temperatures.length <= 105
 * 30 <= temperatures[i] <= 100
 * @Author ping
 * @Date 2023/12/27 15:36
 */
public class DailyTemperatures739 {

    /**
     * 栈（Stack）是一种常用的数据结构，它遵循先进后出（Last In, First Out，LIFO）的原则。在解决问题时，栈常常用于存储临时数据、追踪状态或执行回溯等操作。以下是栈常用的方法：
     * push(element): 将元素压入栈顶。
     * pop(): 弹出栈顶元素，即移除并返回栈顶元素。
     * peek(): 返回栈顶元素但不移除。
     * isEmpty(): 判断栈是否为空，如果为空返回 true，否则返回 false。
     * size(): 返回栈中元素的个数。
     * 这些基本方法构成了栈的核心操作。在实际应用中，栈经常用于解决与括号匹配、深度优先搜索（DFS）、迭代器等问题有关的情况。
     * 例如，使用栈来追踪路径、执行深度优先搜索、处理表达式求值等。
     * 在编程语言中，函数调用栈也是一个常见的应用场景，函数调用的顺序符合栈的后进先出的原则。
     *
     * @param nums
     * @return
     */
    public static int[] dailyTemperatures(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

//    public static void main(String[] args) {
//        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
//        dailyTemperatures(temperatures);
//    }

    @Test
    public void test() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures(temperatures);
    }



    public static void main(String[] args) {
        IntStack stack = new IntStack();

        System.out.println("isEmpty(): " + stack.isEmpty()); // 输出: true
        System.out.println("size(): " + stack.size());       // 输出: 0

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("isEmpty(): " + stack.isEmpty()); // 输出: false
        System.out.println("size(): " + stack.size());       // 输出: 3
        System.out.println("peek(): " + stack.peek());       // 输出: 3

        int poppedElement = stack.pop();
        System.out.println("pop(): " + poppedElement);       // 输出: 3
        System.out.println("peek(): " + stack.peek());       // 输出: 2
    }
}

class IntStack {
    private Stack<Integer> stack;

    public IntStack() {
        this.stack = new Stack<>();
    }

    public void push(int element) {
        stack.push(element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
