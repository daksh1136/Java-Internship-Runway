package day5;
import java.util.ArrayList;
import java.util.EmptyStackException;



public class stack {
    public ArrayList<Integer> elements;

    public stack() {
        elements = new ArrayList<>();
    }

    public void push(int value) {
        elements.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Output: 30

        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Top element after pop: " + stack.peek()); // Output: 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        stack.pop(); // Removes 20
        stack.pop(); // Removes 10

        System.out.println("Is stack empty after popping all elements? " + stack.isEmpty()); // Output: true
    }
}