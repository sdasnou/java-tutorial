import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) throws RuntimeException{
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        // index 1 2 3 4 5 
        //       5(head) 4 3 2 1 // poll
        System.out.println(stack.pop());
        System.out.println(stack);
        // System.out.println(stack.size());
        // System.out.println(stack.peek());
        // System.out.println(stack.size());
    }
}