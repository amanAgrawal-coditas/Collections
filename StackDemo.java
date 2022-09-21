package Week_6.AssignmentCollections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        System.out.println(stack.empty());
        stack.add(56);
        stack.add(52);
        stack.add(51);
        stack.add(58);
        stack.add(59);
        stack.add(53);
        stack.add(54);
        stack.add(57);
        stack.add(59);
        stack.add(60);
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.push(87);
        System.out.println(stack);
        System.out.println(stack.elementAt(4));
        System.out.println(stack.capacity());
        stack.push(44);
        System.out.println(stack.capacity());
        System.out.println(stack.firstElement());
        stack.ensureCapacity(30);
        System.out.println(stack);
        stack.setSize(10);
        System.out.println(stack);
        stack.removeElementAt(6);
        System.out.println(stack);
        stack.setElementAt(65,7);
        System.out.println(stack);

    }
}
