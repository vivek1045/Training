class stack_function {
    static final int maxx = 100;
    int top;
    int a[] = new int[maxx];
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    stack_function()
    {
        top = -1;
    }
 
    boolean push(int x)
    {
        if (top >= (maxx - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
 
    int pop()
    {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
 
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
}
 
class stack {
    public static void main(String args[])
    {
        stack_function s = new stack_function();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop() + " Popped from stack");
    }
}