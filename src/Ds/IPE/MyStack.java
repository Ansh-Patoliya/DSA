package Ds.IPE;

public class MyStack {
    int top, size;
    int[] stack;

    MyStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    static void main() {
        MyStack myStack = new MyStack(4);
        myStack.pop();
        myStack.push(1);
        myStack.push(11);
        myStack.push(21);
        myStack.push(31);
        myStack.display();
        myStack.change(-1, 41);
        myStack.change(5, 41);
        myStack.change(3, 41);
        myStack.change(1, 41);
//        myStack.pop();
//        myStack.push(41);
        myStack.display();
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("stack overflow");
            return;
        }
        stack[++top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return -1;
        }

        return stack[top--];
    }

    void change(int pos, int data) {
        if (pos < 0 || pos > top) {
            System.out.println("pos invalid");
            return;
        }
        stack[pos] = data;
    }

    void display() {
        if (top == -1) {
            System.out.println("stack underflow");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + "-->");
        }
    }

    int evaluatePrefix(String expression) {
        MyStack stack = new MyStack(expression.length());
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    int evaluatePostfix(String expression) {
        MyStack stack = new MyStack(expression.length());
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
