class Node {
	private String string;
	private Node next;
	
	public Node(String s, Node n) {
		string = s;
		next = n;
	}
	
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		if(next == null) {
			return string;
		}
		else {
			return string + next.toString();
		}	
	}
	
}
