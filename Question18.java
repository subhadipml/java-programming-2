import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Program to reverse a queue

class ReverseQueue{
	static Queue<Integer> queue;
	void print() { 
		System.out.println("Queue in reverse order : ");
        while (!queue.isEmpty()) { 
            System.out.print( queue.peek() + " "); 
            queue.remove(); 
        } 
    }
	
	void reversequeue() 
    { 
        Stack<Integer> stack = new Stack<Integer>(); 
        while (!queue.isEmpty()) { 
            stack.add(queue.peek()); 
            queue.remove(); 
        } 
        while (!stack.isEmpty()) { 
            queue.add(stack.peek()); 
            stack.pop(); 
        } 
    }
}



public class Question18 extends ReverseQueue {

	public static void main(String[] args) {
		
		Question18 obj = new Question18();
		
		queue = new LinkedList<Integer>();
		queue.add(2);
		queue.add(1);
		queue.add(4);
		queue.add(3);
		queue.add(5);
		
		obj.reversequeue();
		obj.print();
	}
}
