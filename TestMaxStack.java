import java.util.Stack;

class MaxStack {
    int max = Integer.MIN_VALUE;
    Stack<Integer> stack = new Stack<>();

    public MaxStack() {
    }

    public void push(int val) {
        if (val >= max) {
            stack.push(max);
            max = val;
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        int popped = stack.pop();
        if (popped == max) {
            max = stack.pop();
        }

        if (stack.isEmpty()) {
            max = Integer.MIN_VALUE;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMax() {
        return max;
    }
}

public class TestMaxStack {
    public static void main(String[] args) {
        MaxStack ms = new MaxStack();
        ms.push(5);
        ms.push(1);
        ms.push(3);
        System.out.println("MAX:"+ms.getMax());
        System.out.println("top:"+ms.top());
        ms.pop();
        System.out.println("MAx aster pop"+ms.getMax());
        ms.pop();
        System.out.println("top after pop:"+ms.top());
    }
}
