

public class Stack {
	ListNode<String> n;
	LinkedList<String> l1;
	String topOfStack;
	
	public static void push(String s, ListNode<String> n, LinkedList<String> l, String topOfStack) {
		n = new ListNode<String>(s);
		topOfStack = s;
		l = new LinkedList<String>();
	}
	
	public String pop(String topOfStack, ListNode<String> n) {
		ListNode<String> n1 = null;
		return topOfStack;	
	}
	
	public static void main(String args[]) {
		ListNode<String> n = null;
		LinkedList<String> l1 = null;
		String topOfStack = null;

		push("World", n, l1, topOfStack);
		push("Hello", n, l1, topOfStack);
	}
}
