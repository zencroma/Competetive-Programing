import java.util.*;
import java.io.*;
public class Stack1 {
    public static void main(String[] args) {
        // basic stack operation
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        Integer popped = (Integer) stack.pop();
        Integer Peeked = (Integer) stack.peek();
        Integer Pos = (Integer) stack.search(popped);
    }
}
