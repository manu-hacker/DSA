package DSA2.Stack;

class ArrayImplementaionStack {

    int top;
    int capacity;
    int[] stack;

    ArrayImplementaionStack() {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack is full ");
        }
        return stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is undreflow");
        }
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public void display() {
        for (int j = top; j >= 0; j--) {
            System.out.print(stack[j] + " ");
        }
    }

    public static void main(String[] args) {
        // System.out.println("hello world");

        ArrayImplementaionStack st = new ArrayImplementaionStack();
        st.push(31);
        st.push(32);
        st.push(33);
        st.push(34);
        System.out.println(st.isEmpty());
        System.out.println(st.capacity);
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        st.display();
    }
}
