import java.util.LinkedList;

public class Quesion21 {

	public static LinkedList<String> reverseLinkedList(LinkedList<String> llist) { 
        LinkedList<String> revLinkedList = new LinkedList<String>(); 
        for (int i = llist.size() - 1; i >= 0; i--) { 
            revLinkedList.add(llist.get(i)); 
        } 
        return revLinkedList; 
    }
	public static void main(String[] args) {
        LinkedList<String> linkedli = new LinkedList<String>();
        linkedli.add("one"); 
        linkedli.add("two"); 
        linkedli.add("three"); 
        System.out.print("Elements before reversing: \n"); 
        for (int i = 0; i<linkedli.size(); i++) { 
            System.out.println(linkedli.get(i)); 
        }
        linkedli = reverseLinkedList(linkedli); 
        System.out.print("\nElements after reversing: \n");
        for (int i = 0; i<linkedli.size(); i++) { 
            System.out.println(linkedli.get(i)); 
        }
	}

}
