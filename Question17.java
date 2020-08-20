import java.util.Stack;

//Sorting a stack using a temporary stack

class StackSorting{
	Stack<Integer> stacksorting(Stack<Integer> st){
		
		Stack<Integer> tmp = new Stack<Integer>();
		
		while(!st.isEmpty()) {
			int t = st.pop();
			while(!tmp.isEmpty() && tmp.peek()>t) {
				st.push(tmp.pop());
			}
			tmp.push(t);
		}
		
		
		return tmp;
	}
}

public class Question17 extends StackSorting {

	public static void main(String[] args) {
		
		Question17 obj = new Question17();
		
		Stack<Integer> st = new Stack<Integer>();
		st.add(5);
		st.add(3);
		st.add(1);
		st.add(4);
		st.add(2);
		
		Stack<Integer> temp = obj.stacksorting(st);
		System.out.println("The number in sorted form : ");
		while (!temp.empty()) {
			System.out.println(temp.pop()+" ");
			
		}
	}
}
